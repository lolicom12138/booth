package xyz.apichiyu.project.dto.api.admin;

import java.util.List;

public class AdminAuthorityDTO {
    private String adminId;
    private List<String> listAuthorityId;

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public List<String> getListAuthorityId() {
        return listAuthorityId;
    }

    public void setListAuthorityId(List<String> listAuthorityId) {
        this.listAuthorityId = listAuthorityId;
    }
}
