package xyz.apichiyu.project.entity;

public final class BoothCat extends BaseEntity{
    private String name;
    private String img;
    private int retireTauxPercent;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getRetireTauxPercent() {
        return retireTauxPercent;
    }

    public void setRetireTauxPercent(int retireTauxPercent) {
        this.retireTauxPercent = retireTauxPercent;
    }
}
