package xyz.apichiyu.project.searchForm;

public abstract class BaseSearchForm {
    private String id;
    private boolean pager;
    private int page;
    private int pageRows;

    private String sortBy = "id";
    private String sortType = "asc";

    private boolean fuzzy;
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageRows() {
        return pageRows;
    }

    public void setPageRows(int pageRows) {
        this.pageRows = pageRows;
    }

    public boolean isFuzzy() {
        return fuzzy;
    }

    public void setFuzzy(boolean fuzzy) {
        this.fuzzy = fuzzy;
    }

    public String getSortBy() {
        return sortBy;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    public String getSortType() {
        return sortType;
    }

    public void setSortType(String sortType) {
        this.sortType = sortType;
    }

    public boolean isPager() {
        return pager;
    }

    public void setPager(boolean pager) {
        this.pager = pager;
    }
}
