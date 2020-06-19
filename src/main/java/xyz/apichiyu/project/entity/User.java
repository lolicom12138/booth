package xyz.apichiyu.project.entity;

import java.math.BigDecimal;
import java.util.List;

public final class User extends BaseEntity{
    private String login;
    private String pwd;
    private String tel;
    private String nickName;
    private String cash;
    private BigDecimal amountShare;
    private long timeRegister;
    private long timeLastLogin;
    private String sessionId;
    private String sessionKey;
    private int version;
    private List<UserLoginRecord> listLoginRecord;
    private List<Message> listMessage;
    private WechatLogin wechatLogin;
    private List<UserTag> listTag;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getCash() {
        return cash;
    }

    public void setCash(String cash) {
        this.cash = cash;
    }

    public BigDecimal getAmountShare() {
        return amountShare;
    }

    public void setAmountShare(BigDecimal amountShare) {
        this.amountShare = amountShare;
    }

    public long getTimeRegister() {
        return timeRegister;
    }

    public void setTimeRegister(long timeRegister) {
        this.timeRegister = timeRegister;
    }

    public long getTimeLastLogin() {
        return timeLastLogin;
    }

    public void setTimeLastLogin(long timeLastLogin) {
        this.timeLastLogin = timeLastLogin;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public List<UserLoginRecord> getListLoginRecord() {
        return listLoginRecord;
    }

    public void setListLoginRecord(List<UserLoginRecord> listLoginRecord) {
        this.listLoginRecord = listLoginRecord;
    }

    public List<Message> getListMessage() {
        return listMessage;
    }

    public void setListMessage(List<Message> listMessage) {
        this.listMessage = listMessage;
    }

    public WechatLogin getWechatLogin() {
        return wechatLogin;
    }

    public void setWechatLogin(WechatLogin wechatLogin) {
        this.wechatLogin = wechatLogin;
    }

    public List<UserTag> getListTag() {
        return listTag;
    }

    public void setListTag(List<UserTag> listTag) {
        this.listTag = listTag;
    }
}
