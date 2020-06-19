package xyz.apichiyu.project.entity;

import java.math.BigDecimal;
import java.util.List;

public final class Goods extends BaseEntity{
    private String boothId;
    private Booth booth;
    private String catId;
    private BoothGoodsCat cat;
    private String name;
    private BigDecimal price;
    private double star;
    private String description;
    private boolean active;
    private List<GoodsImg> listImg;

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

    public String getCatId() {
        return catId;
    }

    public void setCatId(String catId) {
        this.catId = catId;
    }

    public BoothGoodsCat getCat() {
        return cat;
    }

    public void setCat(BoothGoodsCat cat) {
        this.cat = cat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public double getStar() {
        return star;
    }

    public void setStar(double star) {
        this.star = star;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<GoodsImg> getListImg() {
        return listImg;
    }

    public void setListImg(List<GoodsImg> listImg) {
        this.listImg = listImg;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
