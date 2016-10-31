package cn.com.cookie.sysuser.service;

import cn.com.cookie.sysuser.bean.DataRegiste;
import cn.com.cookie.sysuser.bean.InfoUser;
import cn.com.cookie.sysuser.entity.AppUserEntity;
import cn.com.cookie.common.jpa.CrudRestService;

/**
 * @author Cookie
 * History:2016年03月21日 (Cookie) 1.0 Create
 */
public interface AppUserEntityService extends CrudRestService<AppUserEntity,Long> {

    /**
     * 根据账号查询用户对象
     * @param account
     * @param validable
     * @return
     */
    AppUserEntity findByAccountAndValid(String account, String validable);

    /**
     * 根据账号查询有效的用户
     * @param account
     * @return
     */
    AppUserEntity findByAccount(String account);

    /**
     * 检查有效账号是否存在
     * @param account
     * @return
     */
    Boolean checkValidAccountExist(String account);

    /**
     * 获取用户信息，返回给页面
     * @param userId
     * @return
     */
    InfoUser findUserInfo(Long userId);

    /**
     * 注册用户
     * @param dataRegiste
     * @return
     */
    Boolean registeUser(DataRegiste dataRegiste);
}
