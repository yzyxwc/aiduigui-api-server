package com.aiduigui.api.server.entity;

import java.io.Serializable;
import java.util.Date;

public class WsTrialUserInfo implements Serializable {
    private Long id;

    private String team;

    private String contactName;

    private String jobs;

    private String contactEmail;

    private String contactPhone;

    private String teamScale;

    private String reference;

    private String demandContent;

    private Long aibiBalance;

    private Long aibiTotal;

    private Long payCharge;

    private Long payBalance;

    private Date memberStartTime;

    private Date memberEndTime;

    private Integer isValid;

    private Date createdTime;

    private Date updatedTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getJobs() {
        return jobs;
    }

    public void setJobs(String jobs) {
        this.jobs = jobs;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getTeamScale() {
        return teamScale;
    }

    public void setTeamScale(String teamScale) {
        this.teamScale = teamScale;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getDemandContent() {
        return demandContent;
    }

    public void setDemandContent(String demandContent) {
        this.demandContent = demandContent;
    }

    public Long getAibiBalance() {
        return aibiBalance;
    }

    public void setAibiBalance(Long aibiBalance) {
        this.aibiBalance = aibiBalance;
    }

    public Long getAibiTotal() {
        return aibiTotal;
    }

    public void setAibiTotal(Long aibiTotal) {
        this.aibiTotal = aibiTotal;
    }

    public Long getPayCharge() {
        return payCharge;
    }

    public void setPayCharge(Long payCharge) {
        this.payCharge = payCharge;
    }

    public Long getPayBalance() {
        return payBalance;
    }

    public void setPayBalance(Long payBalance) {
        this.payBalance = payBalance;
    }

    public Date getMemberStartTime() {
        return memberStartTime;
    }

    public void setMemberStartTime(Date memberStartTime) {
        this.memberStartTime = memberStartTime;
    }

    public Date getMemberEndTime() {
        return memberEndTime;
    }

    public void setMemberEndTime(Date memberEndTime) {
        this.memberEndTime = memberEndTime;
    }

    public Integer getIsValid() {
        return isValid;
    }

    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }
}