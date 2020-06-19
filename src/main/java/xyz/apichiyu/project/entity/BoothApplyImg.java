package xyz.apichiyu.project.entity;

public final class BoothApplyImg extends BaseEntity{
    private String applyId;
    private BoothApply apply;
    private String img;

    public String getApplyId() {
        return applyId;
    }

    public void setApplyId(String applyId) {
        this.applyId = applyId;
    }

    public BoothApply getApply() {
        return apply;
    }

    public void setApply(BoothApply apply) {
        this.apply = apply;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
