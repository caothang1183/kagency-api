package com.kagency.kagencyapi.entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "k_user")
public class User {
    @Id
    @Column(name = "uuid")
    private String uuid;

    @Column(name = "role_id")
    private Integer roleId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "activated")
    private Boolean activated;

    @Column(name = "blocked")
    private Boolean blocked;

    @Column(name = "updated_date")
    private Date updatedAt;

    @Column(name = "created_date")
    private Date createdAt;

    public User() {
    }

    public User(String firstName, String lastName, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    public String getId() {
        return uuid;
    }

    public void setId(String id) {
        this.uuid = uuid;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getActivated() {
        return activated;
    }

    public void setActivated(Boolean activated) {
        this.activated = activated;
    }

    public Boolean getBlocked() {
        return blocked;
    }

    public void setBlocked(Boolean blocked) {
        this.blocked = blocked;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

//    @Override
//    public String toString() {
//        final StringBuilder sb = new StringBuilder("City{");
//        sb.append("id=").append(id);
//        sb.append(", name='").append(name).append('\'');
//        sb.append(", population=").append(population);
//        sb.append('}');
//        return sb.toString();
//    }
}
