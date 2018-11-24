package com.ssh.house.entity;

import java.util.Date;


/**
 * TyInstalmentApply entity. @author MyEclipse Persistence Tools
 */

public class TyInstalmentApply  implements java.io.Serializable {


    // Fields    

     private Integer iaId;
     private Integer iaCustomerId;
     private String iaName;
     private Date iaDate;
     private String iaContent;
     private String iaMind;
     private String iaStatus;
     private Integer iaEmpId;
     private Integer iaApproverId;
     private Integer iaHouseId;
     private Integer iaApprovalState;


    // Constructors

    /** default constructor */
    public TyInstalmentApply() {
    }

    
    /** full constructor */
    public TyInstalmentApply(Integer iaCustomerId, String iaName, Date iaDate, String iaContent, String iaMind, String iaStatus, Integer iaEmpId, Integer iaApproverId, Integer iaHouseId, Integer iaApprovalState) {
        this.iaCustomerId = iaCustomerId;
        this.iaName = iaName;
        this.iaDate = iaDate;
        this.iaContent = iaContent;
        this.iaMind = iaMind;
        this.iaStatus = iaStatus;
        this.iaEmpId = iaEmpId;
        this.iaApproverId = iaApproverId;
        this.iaHouseId = iaHouseId;
        this.iaApprovalState = iaApprovalState;
    }

   
    // Property accessors

    public Integer getIaId() {
        return this.iaId;
    }
    
    public void setIaId(Integer iaId) {
        this.iaId = iaId;
    }

    public Integer getIaCustomerId() {
        return this.iaCustomerId;
    }
    
    public void setIaCustomerId(Integer iaCustomerId) {
        this.iaCustomerId = iaCustomerId;
    }

    public String getIaName() {
        return this.iaName;
    }
    
    public void setIaName(String iaName) {
        this.iaName = iaName;
    }

    public Date getIaDate() {
        return this.iaDate;
    }
    
    public void setIaDate(Date iaDate) {
        this.iaDate = iaDate;
    }

    public String getIaContent() {
        return this.iaContent;
    }
    
    public void setIaContent(String iaContent) {
        this.iaContent = iaContent;
    }

    public String getIaMind() {
        return this.iaMind;
    }
    
    public void setIaMind(String iaMind) {
        this.iaMind = iaMind;
    }

    public String getIaStatus() {
        return this.iaStatus;
    }
    
    public void setIaStatus(String iaStatus) {
        this.iaStatus = iaStatus;
    }

    public Integer getIaEmpId() {
        return this.iaEmpId;
    }
    
    public void setIaEmpId(Integer iaEmpId) {
        this.iaEmpId = iaEmpId;
    }

    public Integer getIaApproverId() {
        return this.iaApproverId;
    }
    
    public void setIaApproverId(Integer iaApproverId) {
        this.iaApproverId = iaApproverId;
    }

    public Integer getIaHouseId() {
        return this.iaHouseId;
    }
    
    public void setIaHouseId(Integer iaHouseId) {
        this.iaHouseId = iaHouseId;
    }

    public Integer getIaApprovalState() {
        return this.iaApprovalState;
    }
    
    public void setIaApprovalState(Integer iaApprovalState) {
        this.iaApprovalState = iaApprovalState;
    }
   








}