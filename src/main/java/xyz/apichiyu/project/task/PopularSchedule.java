package xyz.apichiyu.project.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class PopularSchedule {
    /**
     * 每天凌晨四点生成新的热门摊位
     */
    @Scheduled(cron = "0 0 4 * * ?")
    public void generateBoothPopular() {

    }
    /**
     * 每天凌晨四点生成新的热门商品
     */
    @Scheduled(cron = "0 0 4 * * ?")
    public void generateGoodsPopular() {

    }
}
