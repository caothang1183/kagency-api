package com.kagency.kagencyapi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "k_role")
public class Role {
    @Id
    @Column(name = "uuid")
    private Integer roleId;
    @Column(name = "name")
    private String roleName;
    @Column(name = "description")
    private String roleDescription;
    @Column(name = "created_date")
    private Date createdDate;

    public Role(Integer roleId, String roleName, String roleDescription) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.createdDate = new Date();
        this.roleDescription = roleDescription;
    }

    public Role() {
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDescription() {
        return roleDescription;
    }

    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
