package cn.com.cookie.common.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by Cookie on 2016/4/9.
 */
public class Tools {

    //错误日志输出
    private static Logger errorLogger = LogManager.getLogger("cn.com.cookie.error");

    /**
     * 错误日志
     * @return
     */
    public static Logger getErrorLogger(){
        return errorLogger;
    }

    public static void writeErrorLog(String error){
        errorLogger.error(error);
    }
}
