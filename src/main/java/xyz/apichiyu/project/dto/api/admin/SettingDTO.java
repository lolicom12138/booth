package xyz.apichiyu.project.dto.api.admin;

import xyz.apichiyu.project.entity.Setting;

import java.util.List;

public class SettingDTO {
    private List<Setting> listSetting;

    public List<Setting> getListSetting() {
        return listSetting;
    }

    public void setListSetting(List<Setting> listSetting) {
        this.listSetting = listSetting;
    }
}
