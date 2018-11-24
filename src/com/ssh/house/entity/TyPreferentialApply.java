package com.ssh.house.entity;

import java.util.Date;


/**
 * TyPreferentialApply entity. @author MyEclipse Persistence Tools
 */

public class TyPreferentialApply  implements java.io.Serializable {


    // Fields    

     private Integer paApplyid;
     private Integer paCustomerId;
     private String paName;
     private Integer paEmployeeid;
     private Integer paHouseid;
     private Integer paBeforePrice;
     private Integer paNow;
     private Integer paApply;
     private Integer paAfterPrice;
     private Date paDate;
     private String paStatus;
     private String paContent;
     private String paOpinion;


    // Constructors

    /** default constructor */
    public TyPreferentialApply() {
    }

    
    /** full constructor */
    public TyPreferentialApply(Integer paCustomerId, String paName, Integer paEmployeeid, Integer paHouseid, Integer paBeforePrice, Integer paNow, Integer paApply, Integer paAfterPrice, Date paDate, String paStatus, String paContent, String paOpinion) {
        this.paCustomerId = paCustomerId;
        this.paName = paName;
        this.paEmployeeid = paEmployeeid;
        this.paHouseid = paHouseid;
        this.paBeforePrice = paBeforePrice;
        this.paNow = paNow;
        this.paApply = paApply;
        this.paAfterPrice = paAfterPrice;
        this.paDate = paDate;
        this.paStatus = paStatus;
        this.paContent = paContent;
        this.paOpinion = paOpinion;
    }

   
    // Property accessors

    public Integer getPaApplyid() {
        return this.paApplyid;
    }
    
    public void setPaApplyid(Integer paApplyid) {
        this.paApplyid = paApplyid;
    }

    public Integer getPaCustomerId() {
        return this.paCustomerId;
    }
    
    public void setPaCustomerId(Integer paCustomerId) {
        this.paCustomerId = paCustomerId;
    }

    public String getPaName() {
        return this.paName;
    }
    
    public void setPaName(String paName) {
        this.paName = paName;
    }

    public Integer getPaEmployeeid() {
        return this.paEmployeeid;
    }
    
    public void setPaEmployeeid(Integer paEmployeeid) {
        this.paEmployeeid = paEmployeeid;
    }

    public Integer getPaHouseid() {
        return this.paHouseid;
    }
    
    public void setPaHouseid(Integer paHouseid) {
        this.paHouseid = paHouseid;
    }

    public Integer getPaBeforePrice() {
        return this.paBeforePrice;
    }
    
    public void setPaBeforePrice(Integer paBeforePrice) {
        this.paBeforePrice = paBeforePrice;
    }

    public Integer getPaNow() {
        return this.paNow;
    }
    
    public void setPaNow(Integer paNow) {
        this.paNow = paNow;
    }

    public Integer getPaApply() {
        return this.paApply;
    }
    
    public void setPaApply(Integer paApply) {
        this.paApply = paApply;
    }

    public Integer getPaAfterPrice() {
        return this.paAfterPrice;
    }
    
    public void setPaAfterPrice(Integer paAfterPrice) {
        this.paAfterPrice = paAfterPrice;
    }

    public Date getPaDate() {
        return this.paDate;
    }
    
    public void setPaDate(Date paDate) {
        this.paDate = paDate;
    }

    public String getPaStatus() {
        return this.paStatus;
    }
    
    public void setPaStatus(String paStatus) {
        this.paStatus = paStatus;
    }

    public String getPaContent() {
        return this.paContent;
    }
    
    public void setPaContent(String paContent) {
        this.paContent = paContent;
    }

    public String getPaOpinion() {
        return this.paOpinion;
    }
    
    public void setPaOpinion(String paOpinion) {
        this.paOpinion = paOpinion;
    }
   








}