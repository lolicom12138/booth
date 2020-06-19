package xyz.apichiyu.project.entity;

import xyz.apichiyu.project.enums.ApplyStatus;
import xyz.apichiyu.project.enums.BoothType;

import java.math.BigDecimal;
import java.util.List;

public final class BoothApply extends BaseEntity{
    private String boothId;
    private Booth booth;
    private String applyFor;
    private String content;
    private ApplyStatus status;
    private long time;
    private long timeDone;
    private String adminId;
    private Admin admin;
    private String etc;
    private List<BoothApplyImg> listImg;

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

    public String getApplyFor() {
        return applyFor;
    }

    public void setApplyFor(String applyFor) {
        this.applyFor = applyFor;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public ApplyStatus getStatus() {
        return status;
    }

    public void setStatus(ApplyStatus status) {
        this.status = status;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public long getTimeDone() {
        return timeDone;
    }

    public void setTimeDone(long timeDone) {
        this.timeDone = timeDone;
    }

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public String getEtc() {
        return etc;
    }

    public void setEtc(String etc) {
        this.etc = etc;
    }

    public List<BoothApplyImg> getListImg() {
        return listImg;
    }

    public void setListImg(List<BoothApplyImg> listImg) {
        this.listImg = listImg;
    }
}
