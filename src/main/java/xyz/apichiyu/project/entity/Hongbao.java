package xyz.apichiyu.project.entity;

import java.math.BigDecimal;
import java.util.List;

public final class Hongbao extends BaseEntity{
    private String title;
    private String content;
    private long time;
    private long timeConfirm;
    private double latitude;
    private double longitude;
    private BigDecimal moneyAll;
    private int range;
    private List<HongbaoRecord> listRecord;

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

    public long getTimeConfirm() {
        return timeConfirm;
    }

    public void setTimeConfirm(long timeConfirm) {
        this.timeConfirm = timeConfirm;
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

    public List<HongbaoRecord> getListRecord() {
        return listRecord;
    }

    public void setListRecord(List<HongbaoRecord> listRecord) {
        this.listRecord = listRecord;
    }
}
