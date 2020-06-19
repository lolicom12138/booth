package xyz.apichiyu.project.searchForm;


import xyz.apichiyu.project.enums.SettingValueType;

public final class SettingSearchForm extends BaseSearchForm {
    private String key;
    private String value;
    private SettingValueType type;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public SettingValueType getType() {
        return type;
    }

    public void setType(SettingValueType type) {
        this.type = type;
    }
}
