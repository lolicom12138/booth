package xyz.apichiyu.project.entity;

import java.math.BigDecimal;

public final class BoothMoneyRecord extends BaseEntity{
    private String boothId;
    private Booth booth;
    private long time;
    private BigDecimal value;
    private boolean finalAccounting;
    private long timeFinalAccounting;
    private String orderId;
    private Order order;

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

    public boolean isFinalAccounting() {
        return finalAccounting;
    }

    public void setFinalAccounting(boolean finalAccounting) {
        this.finalAccounting = finalAccounting;
    }

    public long getTimeFinalAccounting() {
        return timeFinalAccounting;
    }

    public void setTimeFinalAccounting(long timeFinalAccounting) {
        this.timeFinalAccounting = timeFinalAccounting;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
