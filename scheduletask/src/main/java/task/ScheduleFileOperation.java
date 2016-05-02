package task;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import utils.FileHelper;

import java.io.File;
import java.io.IOException;

/**
 * Created by Cookie on 2016/5/2.
 */
@Component
public class ScheduleFileOperation {

    private Logger logger = Logger.getLogger("schedule.task.logger");

    @Value("${ftp.inbox.filepath}")
    private String ftpInboxFilePath;
    @Value("${swap.inbox.filepath}")
    private String swapInboxFilePath;

    @Value("${ftp.outbox.filepath}")
    private String ftpOutboxFilePath;
    @Value("${swap.outbox.filepath}")
    private String swapOutboxFilePath;

    /**
     * 从适配器inbox文件夹移动文件到ftp共享文件夹下，不移动适配器inbox目录下的文件
     */
    @Scheduled(cron = "1/5 * * * * ?")
    public void moveFolderFromSwapInbox(){
        File[] filesList = FileHelper.getFolderFilesSort(swapInboxFilePath,null,FileHelper.SORTBY_LASTMOD);
        logger.debug("适配器--开始移动文件夹，文件数："+filesList.length);
        for (File file : filesList){
            //只移动文件夹
            if(file.isDirectory()){
                logger.debug("适配器--移动文件："+file.getName());
                try {
                    FileHelper.moveFolder(file.getPath(),ftpInboxFilePath);
                } catch (IOException e) {
                    e.printStackTrace();
                    logger.debug("适配器--移动文件："+file.getName()+" 失败。");
                    continue;
                }
                logger.debug("适配器--移动文件："+file.getName()+" 成功。");
            }
        }

    }

    /**
     * 从ftp共享文件夹outbox移动文件夹到适配器outbox文件夹下
     */
    @Scheduled(cron = "1/10 * * * * ?")
    public void moveFolderToSwapOutbox(){
        File[] filesList = FileHelper.getFolderFilesSort(ftpOutboxFilePath,null,FileHelper.SORTBY_LASTMOD);
        logger.debug("ftp--开始移动文件夹，文件数："+filesList.length);
        for (File file : filesList){
            //只移动文件夹
            if(file.isDirectory()){
                logger.debug("ftp--移动文件："+file.getName());
                try {
                    FileHelper.moveFolder(file.getPath(),swapOutboxFilePath);
                } catch (IOException e) {
                    e.printStackTrace();
                    logger.debug("ftp--移动文件："+file.getName()+" 失败。");
                    continue;
                }
                logger.debug("ftp--移动文件："+file.getName()+" 成功。");
            }
        }
    }
}
