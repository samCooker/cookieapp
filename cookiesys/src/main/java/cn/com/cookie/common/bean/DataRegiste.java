package cn.com.cookie.common.bean;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by Cookie on 2016/3/27.
 */
public class DataRegiste {

    private Long id;
    @NotNull(message = "账号不能为空")
    private String account;
    @Size(min = 6,max = 30,message = "密码长度在6至30位之间")
    private String password;
    @NotNull(message = "姓名不能为空")
    private String userName;

    /**
     * @return the account
     */
    public String getAccount() {
        return account;
    }

    /**
     * @param account the account to set
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
}
