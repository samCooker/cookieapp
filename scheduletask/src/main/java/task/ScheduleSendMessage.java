package task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import utils.JPushHelper;

import javax.annotation.PostConstruct;

/**
 * Created by Cookie on 2016/5/1.
 */
@Component
public class ScheduleSendMessage {

    /**
     * 每天17:30 18:30 19:30 发送一次
     */
    @Scheduled(cron = "0 30 17,18,19 * * ?")
    //@Scheduled(cron = "1/5 * * * * ?")
    public void sendWarnMessage(){
        boolean isSendOk = JPushHelper.sendWarnMsgToAll("今天还没写日志？点我开始填写。");
        System.out.println("发送完成。返回"+isSendOk);
    }

}
