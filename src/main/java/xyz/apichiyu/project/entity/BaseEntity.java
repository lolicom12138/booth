package xyz.apichiyu.project.entity;

public abstract class BaseEntity {
    protected String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
