package xyz.apichiyu.project.dto.api.admin;

import java.math.BigDecimal;

public class HongbaoDTO {
    //添加时这个id不需要传
    private String id;
    private String title;
    private String content;
    private long time;
    private double latitude;
    private double longitude;
    private BigDecimal moneyAll;
    private int range;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public BigDecimal getMoneyAll() {
        return moneyAll;
    }

    public void setMoneyAll(BigDecimal moneyAll) {
        this.moneyAll = moneyAll;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }
}
