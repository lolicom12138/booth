package xyz.apichiyu.project.entity;

import java.math.BigDecimal;

public final class HongbaoRecord extends BaseEntity{
    private String userId;
    private User user;
    private String hongbaoId;
    private Hongbao hongbao;
    private BigDecimal value;
    private long time;

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

    public String getHongbaoId() {
        return hongbaoId;
    }

    public void setHongbaoId(String hongbaoId) {
        this.hongbaoId = hongbaoId;
    }

    public Hongbao getHongbao() {
        return hongbao;
    }

    public void setHongbao(Hongbao hongbao) {
        this.hongbao = hongbao;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }
}
