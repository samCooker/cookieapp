package cn.com.cookie.sysuser.service;

import cn.com.cookie.sysuser.bean.DataRegiste;
import cn.com.cookie.sysuser.bean.InfoUser;
import cn.com.cookie.sysuser.entity.AppUserEntity;
import cn.com.cookie.sysuser.entity.RoleEntity;
import cn.com.cookie.common.jpa.SimpleDomainRepository;
import cn.com.cookie.common.jpa.SimpleLongIdCrudRestService;
import cn.com.cookie.common.reference.AppValid;
import cn.com.cookie.sysuser.repository.AppUserEntityRepository;
import cn.com.cookie.common.utils.PropertyCopyUtil;
import cn.com.cookie.common.utils.Tools;
import com.google.common.collect.Lists;
import org.apache.commons.lang.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

/**
 * @author Cookie
 * History:2016年03月21日 (Cookie) 1.0 Create
 */
@Service("appUserEntityService")
@Transactional
public class AppUserEntityServiceImpl extends SimpleLongIdCrudRestService<AppUserEntity> implements AppUserEntityService {

    @Autowired
    private AppUserEntityRepository appUserEntityRepository;
    @Autowired
    private Md5PasswordEncoder passwordEncoder;

    @Override
    public SimpleDomainRepository<AppUserEntity, Long> getRepository() {
        return appUserEntityRepository;
    }

    @Override
    public AppUserEntity findByAccountAndValid(String account, String validable) {
        return appUserEntityRepository.findByAccountAndValid(account,validable);
    }

    /**
     * 根据账号查询有效的用户
     * @param account
     * @return
     */
    @Override
    public AppUserEntity findByAccount(String account) {
        return appUserEntityRepository.findByAccountAndValid(account,AppValid.有效.getKey());
    }

    /**
     * 检查有效账号是否存在
     * @param account
     * @return
     */
    @Override
    public Boolean checkValidAccountExist(String account) {
        //查询有效的用户
        AppUserEntity userEntity = this.findByAccount(account);
        if(userEntity!=null){
            return true;
        }
        return false;
    }

    /**
     * 获取用户信息，返回给页面
     * @param userId
     * @return
     */
    @Override
    public InfoUser findUserInfo(Long userId) {
        InfoUser userInfo = null;
        if(userId!=null){
            AppUserEntity userEntity =appUserEntityRepository.findOne(userId);
            if (userEntity != null&&userEntity.getRoleList()!=null) {
                userInfo = PropertyCopyUtil.copy(userEntity, InfoUser.class);
                List<String> rolesName = Lists.newArrayList();
                for(RoleEntity role: userEntity.getRoleList()){
                    rolesName.add(role.getRoleCode());
                }
                userInfo.setRoles(rolesName);
            }
        }
        return userInfo;
    }

    /**
     * 注册用户,将用户信息写入app_user表中，默认角色为游客
     * @return
     */
    @Override
    public Boolean registeUser(DataRegiste dataRegiste) {
        if(dataRegiste == null){
            return false;
        }
        //新增或编辑用户
        AppUserEntity userEntity = null;
        if(dataRegiste.getId()!=null) {
            userEntity = appUserEntityRepository.findOne(dataRegiste.getId());
        }
        if(userEntity==null){
            //检查账号名是否存在
            if(this.checkValidAccountExist(dataRegiste.getAccount())){
                Tools.writeErrorLog("账号"+dataRegiste.getAccount()+"已存在。");
                return false;
            }
            userEntity = new AppUserEntity();
            userEntity.setValid(AppValid.有效.getKey());
            userEntity.setRegisteDate(new Date());
            //产生随机字符串当做salt
            String salt = RandomStringUtils.random(10,true,true);
            userEntity.setSalt(salt);
        }
        if(AppValid.无效.getKey().equals(userEntity.getValid())){
            Tools.writeErrorLog("id为"+userEntity.getId()+"的用户是无效的，不能编辑。");
            return false;
        }
        PropertyCopyUtil.copy(dataRegiste,userEntity);
        //密码加密
        String encodedPassword =passwordEncoder.encodePassword(dataRegiste.getPassword(),userEntity.getSalt());
        userEntity.setPassword(encodedPassword);

        appUserEntityRepository.save(userEntity);

        return true;
    }

}
