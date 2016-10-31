package cn.com.cookie.sysuser.service;

import cn.com.cookie.sysuser.entity.AppUserEntity;
import cn.com.cookie.sysuser.entity.ResourceEntity;
import cn.com.cookie.sysuser.entity.RoleEntity;
import cn.com.cookie.common.reference.AppValid;
import cn.com.cookie.sysuser.bean.UserDetail;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.dao.DataAccessException;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;
import java.util.List;

@Service("myAppUserDetailService")
@Transactional
public class MyUserDetailService implements UserDetailsService {

    @Autowired
    private AppUserEntityService appUserEntityService;
    @Autowired
    private Md5PasswordEncoder passwordEncoder;

    @Value("${default.admin.user.account}")
    private String defaultAccount;
    @Value("${default.admin.user.password}")
    private String defaultPassword;

    /**
     * 运行时若数据库中没有一个用户，则创建默认的管理员账号，并且不需要权限认证
     */
    @PostConstruct
    private void initFirstUser(){
        Long userQty = appUserEntityService.count();
        if(userQty==0L){
            AppUserEntity firstUser = new AppUserEntity();
            firstUser.setAccount(defaultAccount);
            firstUser.setUserName(defaultAccount);
            firstUser.setSalt(defaultAccount);
            firstUser.setValid(AppValid.有效.getKey());
            //密码加密
            String encodedPassword =passwordEncoder.encodePassword(defaultPassword,firstUser.getSalt());
            firstUser.setPassword(encodedPassword);
            appUserEntityService.saveAndFlush(firstUser);
        }
    }

    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException, DataAccessException {
        // 可从数据库获取用户信息及对应的角色
        AppUserEntity userEntity = appUserEntityService.findByAccount(userName);
        if (userEntity == null) {
            throw new UsernameNotFoundException("用户名或密码错误。");
        }
        this.getGrantedAuthorityList(userEntity);

        UserDetail user = new UserDetail(userEntity.getAccount(), userEntity.getPassword(), true, true, true, true, userEntity.getAuthorities());
        //添加额外信息
        user.setId(userEntity.getId());
        user.setSalt(userEntity.getSalt());
        return user;
    }

    /**
     * 从用户实体中获取角色信息
     * @param userEntity
     */
    private void getGrantedAuthorityList(AppUserEntity userEntity) {
        List<GrantedAuthority> auths =  Lists.newArrayList();
        GrantedAuthority ga;
        if (userEntity.getRoleList() != null) {
            for (RoleEntity role : userEntity.getRoleList()) {
                if(role.getResourceList()!=null){
                    for (ResourceEntity res : role.getResourceList()){
                        ga = new SimpleGrantedAuthority(res.getAuthorityName());
                        auths.add(ga);
                    }
                }

            }
        }
        userEntity.setAuthorities(auths);
    }

}