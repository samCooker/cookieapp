package cn.com.cookie.common.reference;

/**
 * Created by Cookie on 2016/4/9.
 */
public enum ResponseCode {

    执行成功("00"),校验错误("01"),执行错误("02")
    ;

    private String key;
    private String value;

    private ResponseCode(String key){
        this(key,null);
    }

    private ResponseCode(String key,String value){
        this.key = key;
        this.value = value;
    }

    /**
     * @return the key
     */
    public String getKey() {
        return key;
    }

    /**
     * @return the value
     */
    public String getValue() {
        return this.value==null?this.name():this.value;
    }
}
