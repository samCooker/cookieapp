import cn.jpush.api.JPushClient;
import cn.jpush.api.common.APIConnectionException;
import cn.jpush.api.common.APIRequestException;
import cn.jpush.api.push.PushResult;
import cn.jpush.api.push.model.Platform;
import cn.jpush.api.push.model.PushPayload;
import cn.jpush.api.push.model.audience.Audience;
import cn.jpush.api.push.model.notification.Notification;
import org.apache.log4j.Logger;
import org.junit.Test;

/**
 * Created by Cookie on 2016/4/27.
 */
public class JpushTest {

    private static Logger logger = Logger.getLogger(JpushTest.class);

    private static final String APK_KEY = "3c7b423687567f149ad9c627";
    private static final String MASTER_SECRET = "f6c4e188328976b46e8c521b";

    public static PushPayload buildPushObject() {
        return PushPayload.newBuilder()
                .setPlatform(Platform.all())
                .setAudience(Audience.all())
                .setNotification(Notification.android("今天还没写日志？点我开始填写。","温馨提示",null))
                .build();
    }

    @Test
    public void sendBaseStringTest() {
        JPushClient jPushClient = new JPushClient(MASTER_SECRET, APK_KEY);
        try {
            logger.debug("send msg");
            PushResult result = jPushClient.sendPush(buildPushObject());
            System.out.println(result.isResultOK());
        } catch (APIConnectionException e) {
            e.printStackTrace();
        } catch (APIRequestException e) {
            e.printStackTrace();
        }
    }
}
