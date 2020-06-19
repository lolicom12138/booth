package xyz.apichiyu.project.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class HotSearchSchedule {
    /**
     * 每小时更新热搜，需要剔除黑名单词
     */
    @Scheduled(cron = "0 0 * * * ?")
    public void generateHotSearch() {

    }
}
