package xyz.apichiyu.project.entity;

import xyz.apichiyu.project.enums.BoothRetireType;

import java.math.BigDecimal;

public final class BoothRetireRecord extends BaseEntity{
    private String boothId;
    private Booth booth;
    private long time;
    private BigDecimal value;
    private BoothRetireType type;
    private long timeDone;

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

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public BoothRetireType getType() {
        return type;
    }

    public void setType(BoothRetireType type) {
        this.type = type;
    }

    public long getTimeDone() {
        return timeDone;
    }

    public void setTimeDone(long timeDone) {
        this.timeDone = timeDone;
    }
}
