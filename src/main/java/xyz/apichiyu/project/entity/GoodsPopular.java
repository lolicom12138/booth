package xyz.apichiyu.project.entity;

import xyz.apichiyu.project.enums.GenerateType;

public final class GoodsPopular extends BaseEntity{
    private String goodsId;
    private Goods goods;
    private long time;
    private long timeExpire;
    private GenerateType type;

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public long getTimeExpire() {
        return timeExpire;
    }

    public void setTimeExpire(long timeExpire) {
        this.timeExpire = timeExpire;
    }

    public GenerateType getType() {
        return type;
    }

    public void setType(GenerateType type) {
        this.type = type;
    }
}
