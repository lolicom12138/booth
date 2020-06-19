package xyz.apichiyu.project.entity;

import java.util.List;

public final class GoodsComment extends BaseEntity{
    private String goodsId;
    private Goods goods;
    private String userId;
    private User user;
    private int star;
    private long time;
    private String content;
    private boolean active;
    private GoodsCommentReply reply;
    private List<GoodsCommentImg> listImg;

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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public GoodsCommentReply getReply() {
        return reply;
    }

    public void setReply(GoodsCommentReply reply) {
        this.reply = reply;
    }

    public List<GoodsCommentImg> getListImg() {
        return listImg;
    }

    public void setListImg(List<GoodsCommentImg> listImg) {
        this.listImg = listImg;
    }
}
