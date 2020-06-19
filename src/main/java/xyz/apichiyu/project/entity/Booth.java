package xyz.apichiyu.project.entity;

import xyz.apichiyu.project.enums.BoothType;

import java.math.BigDecimal;

public final class Booth extends BaseEntity{
    private String catId;
    private BoothCat cat;
    private BoothType type;
    private String name;
    private String logo;
    private String userId;
    private User user;
    private double latitude;
    private double longitude;
    private boolean open;
    private boolean live;
    private boolean status;
    private long time;
    private boolean mobileSale;
    private double star;
    private String cityId;
    private City city;
    private String tel;
    private BigDecimal money;
    private String bankcardNumber;
    private String bank;
    private int retireTauxPercent;
    private boolean onlineOrder;
    private int version;

    public String getCatId() {
        return catId;
    }

    public void setCatId(String catId) {
        this.catId = catId;
    }

    public BoothCat getCat() {
        return cat;
    }

    public void setCat(BoothCat cat) {
        this.cat = cat;
        if(null != cat){
            this.catId = cat.getId();
        }
    }

    public BoothType getType() {
        return type;
    }

    public void setType(BoothType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
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
        if(null != user){
            this.userId = user.getId();
        }
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

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public boolean isLive() {
        return live;
    }

    public void setLive(boolean live) {
        this.live = live;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public boolean isMobileSale() {
        return mobileSale;
    }

    public void setMobileSale(boolean mobileSale) {
        this.mobileSale = mobileSale;
    }

    public double getStar() {
        return star;
    }

    public void setStar(double star) {
        this.star = star;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getBankcardNumber() {
        return bankcardNumber;
    }

    public void setBankcardNumber(String bankcardNumber) {
        this.bankcardNumber = bankcardNumber;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public int getRetireTauxPercent() {
        return retireTauxPercent;
    }

    public void setRetireTauxPercent(int retireTauxPercent) {
        this.retireTauxPercent = retireTauxPercent;
    }

    public boolean isOnlineOrder() {
        return onlineOrder;
    }

    public void setOnlineOrder(boolean onlineOrder) {
        this.onlineOrder = onlineOrder;
    }
}
