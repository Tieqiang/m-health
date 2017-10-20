package com.m.health.entity;

import com.m.health.entity.base.BaseEntity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by Administrator on 2017/10/20.
 */
@Entity
public class User extends BaseEntity {

    private String userName;
    private String loginName;
    private String password;
    private String salt;
    private String costUnitId;



    @Basic
    @Column(name = "user_name", nullable = true, length = 200)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "login_name", nullable = true, length = 20)
    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    @Basic
    @Column(name = "password", nullable = true, length = 50)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "salt", nullable = true, length = 64)
    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    @Basic
    @Column(name = "cost_unit_id", nullable = true, length = 64)
    public String getCostUnitId() {
        return costUnitId;
    }

    public void setCostUnitId(String costUnitId) {
        this.costUnitId = costUnitId;
    }

}
