package xyz.apichiyu.project.entity;

import java.math.BigDecimal;
import java.util.List;

public final class UserTelCode extends BaseEntity{
    private String userId;
    private User user;
    private String tel;
    private String code;
    private long time;
    private long timeExpire;
    private String index;

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

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public long getTimeExpire() {
        return timeExpire;
    }

    public void setTimeExpire(long timeExpire) {
        this.timeExpire = timeExpire;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }
}
