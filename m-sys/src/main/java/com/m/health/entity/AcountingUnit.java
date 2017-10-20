package com.m.health.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Administrator on 2017/10/20.
 */
@Entity
@Table(name = "acounting_unit", schema = "his", catalog = "")
public class AcountingUnit {
    private String id;
    private String acountingUnitName;
    private String parentId;
    private Double unitArea;
    private Integer unitMembersNum;
    private String costDevideMethod;
    private Timestamp createDate;
    private Timestamp modifyDate;
    private String createBy;
    private String modifyBy;
    private String status;

    @Id
    @Column(name = "id", nullable = false, length = 64)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "acounting_unit_name", nullable = true, length = 200)
    public String getAcountingUnitName() {
        return acountingUnitName;
    }

    public void setAcountingUnitName(String acountingUnitName) {
        this.acountingUnitName = acountingUnitName;
    }

    @Basic
    @Column(name = "parent_id", nullable = true, length = 64)
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    @Basic
    @Column(name = "unit_area", nullable = true, precision = 0)
    public Double getUnitArea() {
        return unitArea;
    }

    public void setUnitArea(Double unitArea) {
        this.unitArea = unitArea;
    }

    @Basic
    @Column(name = "unit_members_num", nullable = true)
    public Integer getUnitMembersNum() {
        return unitMembersNum;
    }

    public void setUnitMembersNum(Integer unitMembersNum) {
        this.unitMembersNum = unitMembersNum;
    }

    @Basic
    @Column(name = "cost_devide_method", nullable = true, length = 64)
    public String getCostDevideMethod() {
        return costDevideMethod;
    }

    public void setCostDevideMethod(String costDevideMethod) {
        this.costDevideMethod = costDevideMethod;
    }

    @Basic
    @Column(name = "create_date", nullable = true)
    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "modify_date", nullable = true)
    public Timestamp getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Timestamp modifyDate) {
        this.modifyDate = modifyDate;
    }

    @Basic
    @Column(name = "create_by", nullable = true, length = 64)
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    @Basic
    @Column(name = "modify_by", nullable = true, length = 64)
    public String getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(String modifyBy) {
        this.modifyBy = modifyBy;
    }

    @Basic
    @Column(name = "status", nullable = true, length = 2)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcountingUnit that = (AcountingUnit) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (acountingUnitName != null ? !acountingUnitName.equals(that.acountingUnitName) : that.acountingUnitName != null)
            return false;
        if (parentId != null ? !parentId.equals(that.parentId) : that.parentId != null) return false;
        if (unitArea != null ? !unitArea.equals(that.unitArea) : that.unitArea != null) return false;
        if (unitMembersNum != null ? !unitMembersNum.equals(that.unitMembersNum) : that.unitMembersNum != null)
            return false;
        if (costDevideMethod != null ? !costDevideMethod.equals(that.costDevideMethod) : that.costDevideMethod != null)
            return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;
        if (modifyDate != null ? !modifyDate.equals(that.modifyDate) : that.modifyDate != null) return false;
        if (createBy != null ? !createBy.equals(that.createBy) : that.createBy != null) return false;
        if (modifyBy != null ? !modifyBy.equals(that.modifyBy) : that.modifyBy != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (acountingUnitName != null ? acountingUnitName.hashCode() : 0);
        result = 31 * result + (parentId != null ? parentId.hashCode() : 0);
        result = 31 * result + (unitArea != null ? unitArea.hashCode() : 0);
        result = 31 * result + (unitMembersNum != null ? unitMembersNum.hashCode() : 0);
        result = 31 * result + (costDevideMethod != null ? costDevideMethod.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (modifyDate != null ? modifyDate.hashCode() : 0);
        result = 31 * result + (createBy != null ? createBy.hashCode() : 0);
        result = 31 * result + (modifyBy != null ? modifyBy.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }
}
