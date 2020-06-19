package xyz.apichiyu.project.websocket;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import xyz.apichiyu.project.entity.User;
import xyz.apichiyu.project.util.JsonUtil;
import xyz.apichiyu.project.websocket.bean.WSMessage;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@ServerEndpoint("/socket/{sessionId}/{nonceStr}/{sign}")
@Component
public class WSConnection {
    private static Map<String, WSConnection> sessionPools = new ConcurrentHashMap<>();
    private User user;
    private Session session;
    //上一次发生会话的时间。如果间隔时间过长，可以考虑断开
    private long timeLastMessage;
    public boolean sendMessage(WSMessage message){
        try{
            synchronized (session) {
                session.getBasicRemote().sendText(JsonUtil.toJson(message));
            }
            return true;
        }catch(Exception e){
            return false;
        }
    }
    @OnOpen
    public void onOpen(Session session, @PathVariable(value = "sessionId") String sessionId,@PathVariable(value = "nonceStr") String nonceStr,@PathVariable(value = "sign") String sign){
        //TODO 进行登录判定，如果没问题，放入连接池
    }
    @OnClose
    public void onClose(){
        //TODO 从连接池清除
    }
    @OnError
    public void onError(){
        //TODO 遇到错误，根据错误情况进行处理，保持连接或者断开连接
    }
    @OnMessage
    public void onMessage(String msg){
        //TODO 处理收到的消息，讲json的msg转成实体类或map，然后根据里面的内容进行处理
    }
}
