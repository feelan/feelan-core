package net.feelan.core.criteria;

import org.apache.commons.lang.builder.ToStringBuilder;

public abstract class AbstractCriteria {
    private Long id;
    private String keyword;
    private boolean isAjax = false;
    private boolean deep=false;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public boolean isAjax() {
        return isAjax;
    }

    public void setAjax(boolean isAjax) {
        this.isAjax = isAjax;
    }

    public boolean isDeep() {
        return deep;
    }

    public void setDeep(boolean deep) {
        this.deep = deep;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
    

}
