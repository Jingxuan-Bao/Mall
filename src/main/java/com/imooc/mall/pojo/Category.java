package com.imooc.mall.pojo;

import java.util.Date;

public class Category {

    private Integer id;

    private Integer parentId;

    private String name;

    private Integer status;

    private Integer sortOrder;

    private Date create_time;

    private Date updatetime;

    public Integer getId() {
        return id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public String getName() {
        return name;
    }

    public Integer getStatus() {
        return status;
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}
