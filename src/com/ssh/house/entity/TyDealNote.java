package com.ssh.house.entity;

import java.util.Date;


/**
 * TyDealNote entity. @author MyEclipse Persistence Tools
 */

public class TyDealNote  implements java.io.Serializable {


    // Fields    

     private Integer dnId;
     private Integer dnCustomerId;
     private Integer employeeid;
     private Date dnDate;
     private Integer dnBeginPrice;
     private Integer dnEndPrice;
     private Integer applyid;
     private String dnDescription;


    // Constructors

    /** default constructor */
    public TyDealNote() {
    }

    
    /** full constructor */
    public TyDealNote(Integer dnCustomerId, Integer employeeid, Date dnDate, Integer dnBeginPrice, Integer dnEndPrice, Integer applyid, String dnDescription) {
        this.dnCustomerId = dnCustomerId;
        this.employeeid = employeeid;
        this.dnDate = dnDate;
        this.dnBeginPrice = dnBeginPrice;
        this.dnEndPrice = dnEndPrice;
        this.applyid = applyid;
        this.dnDescription = dnDescription;
    }

   
    // Property accessors

    public Integer getDnId() {
        return this.dnId;
    }
    
    public void setDnId(Integer dnId) {
        this.dnId = dnId;
    }

    public Integer getDnCustomerId() {
        return this.dnCustomerId;
    }
    
    public void setDnCustomerId(Integer dnCustomerId) {
        this.dnCustomerId = dnCustomerId;
    }

    public Integer getEmployeeid() {
        return this.employeeid;
    }
    
    public void setEmployeeid(Integer employeeid) {
        this.employeeid = employeeid;
    }

    public Date getDnDate() {
        return this.dnDate;
    }
    
    public void setDnDate(Date dnDate) {
        this.dnDate = dnDate;
    }

    public Integer getDnBeginPrice() {
        return this.dnBeginPrice;
    }
    
    public void setDnBeginPrice(Integer dnBeginPrice) {
        this.dnBeginPrice = dnBeginPrice;
    }

    public Integer getDnEndPrice() {
        return this.dnEndPrice;
    }
    
    public void setDnEndPrice(Integer dnEndPrice) {
        this.dnEndPrice = dnEndPrice;
    }

    public Integer getApplyid() {
        return this.applyid;
    }
    
    public void setApplyid(Integer applyid) {
        this.applyid = applyid;
    }

    public String getDnDescription() {
        return this.dnDescription;
    }
    
    public void setDnDescription(String dnDescription) {
        this.dnDescription = dnDescription;
    }
   








}