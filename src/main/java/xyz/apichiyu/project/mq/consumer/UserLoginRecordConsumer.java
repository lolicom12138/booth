package xyz.apichiyu.project.mq.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import xyz.apichiyu.project.entity.UserLoginRecord;
import xyz.apichiyu.project.service.UserLoginRecordService;

@RabbitListener(queues = "UserLoginRecord")
public class UserLoginRecordConsumer {
    private UserLoginRecordService userLoginRecordService;
    @Autowired
    public UserLoginRecordConsumer(UserLoginRecordService userLoginRecordService){
        this.userLoginRecordService = userLoginRecordService;
    }
    @RabbitHandler
    public void process(UserLoginRecord record) {
        userLoginRecordService.add(record);
    }
}
