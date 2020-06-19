package xyz.apichiyu.project.entity;

public final class GoodsTag extends BaseEntity{
    private String goodsId;
    private String tagId;

    public String getBoothId() {
        return goodsId;
    }

    public void setBoothId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getTagId() {
        return tagId;
    }

    public void setTagId(String tagId) {
        this.tagId = tagId;
    }
}
