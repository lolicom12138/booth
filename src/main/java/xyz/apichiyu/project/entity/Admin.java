package xyz.apichiyu.project.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;

import java.util.List;

@ApiModel(description= "管理员实体类")
public final class Admin extends BaseEntity{
    private String login;
    private String pwd;
    private String name;
    private String duty;
    private String etc;
    private boolean active;
    private String sessionId;
    private String sessionKey;
    private int version;
    @ApiModelProperty(hidden = true)
    private List<Authority> listAuthority;

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

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public String getEtc() {
        return etc;
    }

    public void setEtc(String etc) {
        this.etc = etc;
    }

    public boolean checkAuthority(String authorityName){
        if(null != listAuthority) {
            for (int i = 0; i < listAuthority.size(); i++) {
                if (listAuthority.get(i).getName().equals(authorityName)) {
                    return true;
                }
            }
        }
        return false;
    }
}
