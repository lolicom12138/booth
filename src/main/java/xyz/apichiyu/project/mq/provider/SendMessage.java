package xyz.apichiyu.project.mq.provider;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import xyz.apichiyu.project.entity.Message;
import xyz.apichiyu.project.entity.User;


@Component
public class SendMessage {
    private static RabbitTemplate rabbitTemplate;
    @Autowired
    public SendMessage(RabbitTemplate rabbitTemplate){
        this.rabbitTemplate = rabbitTemplate;
    }
    //这只是一个例子
    public static void sendMessage(User user, Message message){
        message.setRead(false);
        message.setUser(user);
        rabbitTemplate.convertAndSend("Messager","SendMessage",message);
    }
}
