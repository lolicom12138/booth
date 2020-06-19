package xyz.apichiyu.project.entity;

import xyz.apichiyu.project.enums.AuthorityType;

import java.util.List;

public final class Authority extends BaseEntity{
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
