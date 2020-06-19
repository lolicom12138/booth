package xyz.apichiyu.project.mq.provider;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import xyz.apichiyu.project.entity.User;

@Component
public class UserLoginRecordProvider {
    private static RabbitTemplate rabbitTemplate;
    @Autowired
    public UserLoginRecordProvider(RabbitTemplate rabbitTemplate){
        this.rabbitTemplate = rabbitTemplate;
    }
    public void record(User user){
        rabbitTemplate.convertAndSend("Record","UserLoginRecord",user);
    }
}
