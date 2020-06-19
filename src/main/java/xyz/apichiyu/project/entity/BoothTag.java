package xyz.apichiyu.project.entity;

public final class BoothTag extends BaseEntity{
    private String boothId;
    private String tagId;

    public String getBoothId() {
        return boothId;
    }

    public void setBoothId(String boothId) {
        this.boothId = boothId;
    }

    public String getTagId() {
        return tagId;
    }

    public void setTagId(String tagId) {
        this.tagId = tagId;
    }
}
