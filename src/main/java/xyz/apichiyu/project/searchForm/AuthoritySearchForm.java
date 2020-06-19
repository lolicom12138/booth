package xyz.apichiyu.project.searchForm;

import xyz.apichiyu.project.enums.AuthorityType;

public final class AuthoritySearchForm extends BaseSearchForm {
    private String name;
    private String description;
    private AuthorityType type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
