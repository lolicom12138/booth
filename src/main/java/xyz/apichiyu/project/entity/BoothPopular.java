package xyz.apichiyu.project.entity;

import xyz.apichiyu.project.enums.GenerateType;

public final class BoothPopular extends BaseEntity{
    private String boothId;
    private Booth booth;
    private long time;
    private long timeExpire;
    private GenerateType type;

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
