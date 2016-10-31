package cn.com.cookie.sysuser.bean;

import cn.com.cookie.common.reference.ResponseCode;

/**
 * Created by Cookie on 2016/4/9.
 */
public class InfoReturn {

    /**执行成功与否的标志 true:成功 false:失败*/
    private Boolean flag;
    /**返回的信息*/
    private String msg;
    /**返回的代号*/
    private String code;

    public InfoReturn() {
        //默认值
        this.code= ResponseCode.执行成功.getKey();
        this.flag=true;
    }

    /**
     * 设置执行错误信息
     * @param error
     * @param errorCoke
     */
    public void setError(String error,String errorCoke) {
        this.flag=false;
        this.code=errorCoke;
        this.msg = error;
    }

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the flag
     */
    public Boolean getFlag() {
        return flag;
    }

    /**
     * @param flag the flag to set
     */
    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    /**
     * @return the msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     * @param msg the msg to set
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }
}
