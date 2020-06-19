package xyz.apichiyu.project.entity;

import java.util.List;

public final class Province extends BaseEntity{
    private String name;
    private List<City> listCity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<City> getListCity() {
        return listCity;
    }

    public void setListCity(List<City> listCity) {
        this.listCity = listCity;
    }
}
