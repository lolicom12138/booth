package xyz.apichiyu.project.searchForm;

import xyz.apichiyu.project.entity.BaseEntity;
import xyz.apichiyu.project.entity.User;

public final class WechatLoginSearchForm extends BaseSearchForm {
    private String openId;
    private String unionId;
    private String sessionKey;

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getUnionId() {
        return unionId;
    }

    public void setUnionId(String unionId) {
        this.unionId = unionId;
    }

    public String getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }
}
