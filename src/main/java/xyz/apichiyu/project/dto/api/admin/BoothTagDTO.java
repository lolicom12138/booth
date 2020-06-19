package xyz.apichiyu.project.dto.api.admin;

import java.util.List;

public class BoothTagDTO {
    private String boothId;
    private List<String> listTag;

    public String getBoothId() {
        return boothId;
    }

    public void setBoothId(String boothId) {
        this.boothId = boothId;
    }

    public List<String> getListTag() {
        return listTag;
    }

    public void setListTag(List<String> listTag) {
        this.listTag = listTag;
    }
}
