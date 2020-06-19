package xyz.apichiyu.project.entity;

public final class BoothAdminActionRecord extends BaseEntity{
    private String adminId;
    private BoothAdmin admin;
    private String action;
    private String content;
    private String time;
    private String ip;

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public BoothAdmin getAdmin() {
        return admin;
    }

    public void setAdmin(BoothAdmin admin) {
        this.admin = admin;
        if(null != admin){
            this.adminId = admin.getId();
        }
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
