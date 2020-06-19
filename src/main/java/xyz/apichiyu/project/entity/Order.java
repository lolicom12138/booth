package xyz.apichiyu.project.entity;

import xyz.apichiyu.project.enums.OrderStatus;
import xyz.apichiyu.project.enums.PayType;

import java.math.BigDecimal;

public final class Order extends BaseEntity{
    private String boothId;
    private Booth booth;
    private String userId;
    private User user;
    private BigDecimal price;
    private long time;
    private PayType typePay;
    private long timePay;
    private BigDecimal moneyValue;
    private BigDecimal payValue;
    private String code;
    private OrderStatus status;

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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public PayType getTypePay() {
        return typePay;
    }

    public void setTypePay(PayType typePay) {
        this.typePay = typePay;
    }

    public long getTimePay() {
        return timePay;
    }

    public void setTimePay(long timePay) {
        this.timePay = timePay;
    }

    public BigDecimal getMoneyValue() {
        return moneyValue;
    }

    public void setMoneyValue(BigDecimal moneyValue) {
        this.moneyValue = moneyValue;
    }

    public BigDecimal getPayValue() {
        return payValue;
    }

    public void setPayValue(BigDecimal payValue) {
        this.payValue = payValue;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}
