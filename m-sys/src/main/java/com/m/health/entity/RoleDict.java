package com.m.health.entity;

import com.m.health.entity.base.BaseEntity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Administrator on 2017/10/20.
 */
@Entity
@Table(name = "role_dict", schema = "his", catalog = "")
public class RoleDict extends BaseEntity{

    private String roleName;
    private String moduleId;

    @Basic
    @Column(name = "role_name", nullable = true, length = 200)
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Basic
    @Column(name = "module_id", nullable = true, length = 64)
    public String getModuleId() {
        return moduleId;
    }

    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }

}
