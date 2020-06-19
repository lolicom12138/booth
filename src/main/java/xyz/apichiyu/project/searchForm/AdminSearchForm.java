package xyz.apichiyu.project.searchForm;

import java.util.List;

public final class AdminSearchForm extends BaseSearchForm {
    private String login;
    private String pwd;
    private boolean active;

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
}
