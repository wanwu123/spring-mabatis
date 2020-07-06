package com.example.demo.po;

import org.springframework.stereotype.Component;

import java.util.Date;


@Component
public class User{
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", type=" + type +
                ", role=" + role +
                ", manageType=" + manageType +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", unitId=" + unitId +
                ", workStatus=" + workStatus +
                ", status=" + status +
                ", createTime=" + createTime +
                ", modifyTime=" + modifyTime +
                ", isBusy=" + isBusy +
                ", onworktime=" + onworktime +
                ", offworktime=" + offworktime +
                ", area=" + area +
                ", county=" + county +
                ", passportRole=" + passportRole +
                ", isKf=" + isKf +
                '}';
    }

    private Long id;

    private Integer type;

    private Integer role;

    private Integer manageType;

    private String name;

    private String phone;

    private Long unitId;

    private Integer workStatus;

    private Integer status;

    private Date createTime;

    private Date modifyTime;

    private Integer isBusy;

    private Date onworktime;

    private Date offworktime;

    private Integer area;

    private Integer county;

    private Integer passportRole;

    private Integer isKf;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public Integer getManageType() {
        return manageType;
    }

    public void setManageType(Integer manageType) {
        this.manageType = manageType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Long getUnitId() {
        return unitId;
    }

    public void setUnitId(Long unitId) {
        this.unitId = unitId;
    }

    public Integer getWorkStatus() {
        return workStatus;
    }

    public void setWorkStatus(Integer workStatus) {
        this.workStatus = workStatus;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Integer getIsBusy() {
        return isBusy;
    }

    public void setIsBusy(Integer isBusy) {
        this.isBusy = isBusy;
    }

    public Date getOnworktime() {
        return onworktime;
    }

    public void setOnworktime(Date onworktime) {
        this.onworktime = onworktime;
    }

    public Date getOffworktime() {
        return offworktime;
    }

    public void setOffworktime(Date offworktime) {
        this.offworktime = offworktime;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Integer getCounty() {
        return county;
    }

    public void setCounty(Integer county) {
        this.county = county;
    }

    public Integer getPassportRole() {
        return passportRole;
    }

    public void setPassportRole(Integer passportRole) {
        this.passportRole = passportRole;
    }

    public Integer getIsKf() {
        return isKf;
    }

    public void setIsKf(Integer isKf) {
        this.isKf = isKf;
    }
}
