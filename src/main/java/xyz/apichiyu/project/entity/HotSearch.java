package xyz.apichiyu.project.entity;

import xyz.apichiyu.project.enums.GenerateType;

public final class HotSearch extends BaseEntity{
    private String keyword;
    private int hot;
    private GenerateType type;

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public int getHot() {
        return hot;
    }

    public void setHot(int hot) {
        this.hot = hot;
    }

    public GenerateType getType() {
        return type;
    }

    public void setType(GenerateType type) {
        this.type = type;
    }
}
