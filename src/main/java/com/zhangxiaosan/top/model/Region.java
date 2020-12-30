package com.zhangxiaosan.top.model;

public class Region {
    private Integer id;

    private String regionName;

    private Double regionLng;

    private Double regionLan;

    private Integer builddingNum;

    private Integer createTime;

    private Integer updateTime;

    private Integer deleteTime;

    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName == null ? null : regionName.trim();
    }

    public Double getRegionLng() {
        return regionLng;
    }

    public void setRegionLng(Double regionLng) {
        this.regionLng = regionLng;
    }

    public Double getRegionLan() {
        return regionLan;
    }

    public void setRegionLan(Double regionLan) {
        this.regionLan = regionLan;
    }

    public Integer getBuilddingNum() {
        return builddingNum;
    }

    public void setBuilddingNum(Integer builddingNum) {
        this.builddingNum = builddingNum;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Integer getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Integer deleteTime) {
        this.deleteTime = deleteTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}