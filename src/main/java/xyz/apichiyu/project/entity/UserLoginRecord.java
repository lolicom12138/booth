package xyz.apichiyu.project.entity;

import xyz.apichiyu.project.enums.UserLoginRecordType;

public final class UserLoginRecord extends BaseEntity{
    private String userId;
    private User user;
    private long time;
    private UserLoginRecordType type;
    private String ip;

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

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public UserLoginRecordType getType() {
        return type;
    }

    public void setType(UserLoginRecordType type) {
        this.type = type;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
