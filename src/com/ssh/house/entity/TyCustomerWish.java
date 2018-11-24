package com.ssh.house.entity;

import java.util.Date;


/**
 * TyCustomerWish entity. @author MyEclipse Persistence Tools
 */

public class TyCustomerWish  implements java.io.Serializable {


    // Fields    

     private Integer cwId;
     private String cwName;
     private String cwSex;
     private Integer cwPhone;
     private Date cwDate;
     private Integer cwCount;
     private String cwArea;
     private String cwWill;
     private String cwUse;
     private String cwConsiderate;
     private String cwExpectation;
     private String cwDescription;


    // Constructors

    /** default constructor */
    public TyCustomerWish() {
    }

    
    /** full constructor */
    public TyCustomerWish(String cwName, String cwSex, Integer cwPhone, Date cwDate, Integer cwCount, String cwArea, String cwWill, String cwUse, String cwConsiderate, String cwExpectation, String cwDescription) {
        this.cwName = cwName;
        this.cwSex = cwSex;
        this.cwPhone = cwPhone;
        this.cwDate = cwDate;
        this.cwCount = cwCount;
        this.cwArea = cwArea;
        this.cwWill = cwWill;
        this.cwUse = cwUse;
        this.cwConsiderate = cwConsiderate;
        this.cwExpectation = cwExpectation;
        this.cwDescription = cwDescription;
    }

   
    // Property accessors

    public Integer getCwId() {
        return this.cwId;
    }
    
    public void setCwId(Integer cwId) {
        this.cwId = cwId;
    }

    public String getCwName() {
        return this.cwName;
    }
    
    public void setCwName(String cwName) {
        this.cwName = cwName;
    }

    public String getCwSex() {
        return this.cwSex;
    }
    
    public void setCwSex(String cwSex) {
        this.cwSex = cwSex;
    }

    public Integer getCwPhone() {
        return this.cwPhone;
    }
    
    public void setCwPhone(Integer cwPhone) {
        this.cwPhone = cwPhone;
    }

    public Date getCwDate() {
        return this.cwDate;
    }
    
    public void setCwDate(Date cwDate) {
        this.cwDate = cwDate;
    }

    public Integer getCwCount() {
        return this.cwCount;
    }
    
    public void setCwCount(Integer cwCount) {
        this.cwCount = cwCount;
    }

    public String getCwArea() {
        return this.cwArea;
    }
    
    public void setCwArea(String cwArea) {
        this.cwArea = cwArea;
    }

    public String getCwWill() {
        return this.cwWill;
    }
    
    public void setCwWill(String cwWill) {
        this.cwWill = cwWill;
    }

    public String getCwUse() {
        return this.cwUse;
    }
    
    public void setCwUse(String cwUse) {
        this.cwUse = cwUse;
    }

    public String getCwConsiderate() {
        return this.cwConsiderate;
    }
    
    public void setCwConsiderate(String cwConsiderate) {
        this.cwConsiderate = cwConsiderate;
    }

    public String getCwExpectation() {
        return this.cwExpectation;
    }
    
    public void setCwExpectation(String cwExpectation) {
        this.cwExpectation = cwExpectation;
    }

    public String getCwDescription() {
        return this.cwDescription;
    }
    
    public void setCwDescription(String cwDescription) {
        this.cwDescription = cwDescription;
    }
   








}