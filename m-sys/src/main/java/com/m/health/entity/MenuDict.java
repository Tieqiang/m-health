package com.m.health.entity;

import com.m.health.entity.base.BaseEntity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Administrator on 2017/10/20.
 */
@Entity
@Table(name = "menu_dict", schema = "his", catalog = "")
public class MenuDict extends BaseEntity {
    private String menuName;
    private String parentMenu;
    private String path;
    private String moduleId;


    @Basic
    @Column(name = "menu_name", nullable = true, length = 200)
    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    @Basic
    @Column(name = "parent_menu", nullable = true, length = 64)
    public String getParentMenu() {
        return parentMenu;
    }

    public void setParentMenu(String parentMenu) {
        this.parentMenu = parentMenu;
    }

    @Basic
    @Column(name = "path", nullable = true, length = 200)
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
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
