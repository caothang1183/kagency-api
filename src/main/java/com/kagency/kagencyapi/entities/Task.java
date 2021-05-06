package com.kagency.kagencyapi.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Task {
    @Id
    private Integer taskId;
    private String createdBy;
    private String assignedBy;
    private String watchingBy;
    private String updatedBy;
    private Integer priorityId;
    private Integer statusId;
    private String title;
    private String description;
    private Integer estimatePoint;
    private Date deadline;
    private Date updatedAt;
    private Date createdAt;

    public Task() {
    }

    public Task(String createdBy, String title, String description) {
        this.createdBy = createdBy;
        this.title = title;
        this.description = description;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getAssignedBy() {
        return assignedBy;
    }

    public void setAssignedBy(String assignedBy) {
        this.assignedBy = assignedBy;
    }

    public String getWatchingBy() {
        return watchingBy;
    }

    public void setWatchingBy(String watchingBy) {
        this.watchingBy = watchingBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Integer getPriorityId() {
        return priorityId;
    }

    public void setPriorityId(Integer priorityId) {
        this.priorityId = priorityId;
    }

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getEstimatePoint() {
        return estimatePoint;
    }

    public void setEstimatePoint(Integer estimatePoint) {
        this.estimatePoint = estimatePoint;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
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
}
