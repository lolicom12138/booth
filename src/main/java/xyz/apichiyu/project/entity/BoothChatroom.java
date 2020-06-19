package xyz.apichiyu.project.entity;

public final class BoothChatroom extends BaseEntity{
    private String boothId;
    private Booth booth;
    private String name;
    private String time;

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
        if(null != booth){
            this.boothId = booth.getId();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
