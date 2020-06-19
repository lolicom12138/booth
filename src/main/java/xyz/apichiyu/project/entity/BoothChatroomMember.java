package xyz.apichiyu.project.entity;

public final class BoothChatroomMember extends BaseEntity{
    private String chatroomId;
    private BoothChatroom chatroom;
    private String userId;
    private User user;
    private String time;
    private boolean push;

    public String getChatroomId() {
        return chatroomId;
    }

    public void setChatroomId(String chatroomId) {
        this.chatroomId = chatroomId;
    }

    public BoothChatroom getChatroom() {
        return chatroom;
    }

    public void setChatroom(BoothChatroom chatroom) {
        this.chatroom = chatroom;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public boolean isPush() {
        return push;
    }

    public void setPush(boolean push) {
        this.push = push;
    }
}
