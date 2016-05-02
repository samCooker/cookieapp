package controllers;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import utils.JPushHelper;

/**
 * Created by Cookie on 2016/5/2.
 */

@Controller
@RequestMapping("sys")
public class LoginController {

    @RequestMapping("login")
    @ResponseBody
    public boolean login(){
        System.out.println("login");
        boolean isSendOk = JPushHelper.sendWarnMsgToAll("今天还没写日志？点我开始填写。");
        System.out.println("发送完成。返回"+isSendOk);
        return false;
    }

}
