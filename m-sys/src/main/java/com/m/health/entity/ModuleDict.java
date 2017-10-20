package com.m.health.entity;

import com.m.health.entity.base.BaseEntity;

import javax.persistence.*;

/**
 * Created by Administrator on 2017/10/20.
 */
@Entity
@Table(name = "module_dict", schema = "his", catalog = "")
public class ModuleDict extends BaseEntity{
    private String moduleName;
    private String indexPage;
    private String moduleDesc;


    @Basic
    @Column(name = "module_name", nullable = true, length = 200)
    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    @Basic
    @Column(name = "index_page", nullable = true, length = 200)
    public String getIndexPage() {
        return indexPage;
    }

    public void setIndexPage(String indexPage) {
        this.indexPage = indexPage;
    }

    @Basic
    @Column(name = "module_desc", nullable = true, length = -1)
    public String getModuleDesc() {
        return moduleDesc;
    }

    public void setModuleDesc(String moduleDesc) {
        this.moduleDesc = moduleDesc;
    }

}
