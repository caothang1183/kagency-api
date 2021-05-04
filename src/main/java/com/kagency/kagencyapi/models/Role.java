package com.kagency.kagencyapi.models;

public class Role {
    private Integer roleId;
    private String roleName;
    private String roleDescription;

    private String createdDate;

    public Role(Integer roleId, String roleName, String createdDate, String roleDescription) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.createdDate = createdDate;
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

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }
}
