package xyz.apichiyu.project.entity;

public final class BoothComment extends BaseEntity{
    private String boothId;
    private Booth booth;
    private String userId;
    private User user;
    private double star;
    private int starService;
    private int starGoods;
    private int starPrice;
    private long time;
    private String content;
    private boolean active;

    public String getBoothId() {
        return boothId;
    }

    public void setBoothId(String boothId) {
        this.boothId = boothId;
    }

    public Booth getBooth() {
        return booth;
    }

    public void setBooth(Booth booth) {
        this.booth = booth;
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

    public double getStar() {
        return star;
    }

    public void setStar(double star) {
        this.star = star;
    }

    public int getStarService() {
        return starService;
    }

    public void setStarService(int starService) {
        this.starService = starService;
    }

    public int getStarGoods() {
        return starGoods;
    }

    public void setStarGoods(int starGoods) {
        this.starGoods = starGoods;
    }

    public int getStarPrice() {
        return starPrice;
    }

    public void setStarPrice(int starPrice) {
        this.starPrice = starPrice;
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
}
