package xyz.apichiyu.project.entity;

import java.util.List;

public final class BoothAdmin extends BaseEntity{
    private String boothId;
    private Booth booth;
    private String login;
    private String pwd;
    private String name;
    private boolean active;
    private String sessionId;
    private String sessionKey;
    private int version;
    private List<Authority> listAuthority;

    public String getBoothId() {
        return boothId;
    }

    public void setBoothId(String boothId) {
        this.boothId = boothId;
    }

    public Booth getBooth() {
        return booth;
    }

    public void setBooth(Booth booth) {
        this.booth = booth;
        if(null != booth){
            this.boothId = booth.getId();
        }
    }

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
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

    public List<Authority> getListAuthority() {
        return listAuthority;
    }

    public void setListAuthority(List<Authority> listAuthority) {
        this.listAuthority = listAuthority;
    }
}
