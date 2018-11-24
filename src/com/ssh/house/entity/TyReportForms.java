package com.ssh.house.entity;

import java.util.Date;


/**
 * TyReportForms entity. @author MyEclipse Persistence Tools
 */

public class TyReportForms  implements java.io.Serializable {


    // Fields    

     private Integer rfId;
     private TyEmployee tyEmployee;
     private String rfName;
     private Date rfCreatdate;
     private Integer rfFact;
     private Integer rfPlan;
     private Integer rfCount;
     private Integer rfAverage;
     private Date rfBegin;
     private Date rfEnd;
     private String rfDescription;


    // Constructors

    /** default constructor */
    public TyReportForms() {
    }

    
    /** full constructor */
    public TyReportForms(TyEmployee tyEmployee, String rfName, Date rfCreatdate, Integer rfFact, Integer rfPlan, Integer rfCount, Integer rfAverage, Date rfBegin, Date rfEnd, String rfDescription) {
        this.tyEmployee = tyEmployee;
        this.rfName = rfName;
        this.rfCreatdate = rfCreatdate;
        this.rfFact = rfFact;
        this.rfPlan = rfPlan;
        this.rfCount = rfCount;
        this.rfAverage = rfAverage;
        this.rfBegin = rfBegin;
        this.rfEnd = rfEnd;
        this.rfDescription = rfDescription;
    }

   
    // Property accessors

    public Integer getRfId() {
        return this.rfId;
    }
    
    public void setRfId(Integer rfId) {
        this.rfId = rfId;
    }

    public TyEmployee getTyEmployee() {
        return this.tyEmployee;
    }
    
    public void setTyEmployee(TyEmployee tyEmployee) {
        this.tyEmployee = tyEmployee;
    }

    public String getRfName() {
        return this.rfName;
    }
    
    public void setRfName(String rfName) {
        this.rfName = rfName;
    }

    public Date getRfCreatdate() {
        return this.rfCreatdate;
    }
    
    public void setRfCreatdate(Date rfCreatdate) {
        this.rfCreatdate = rfCreatdate;
    }

    public Integer getRfFact() {
        return this.rfFact;
    }
    
    public void setRfFact(Integer rfFact) {
        this.rfFact = rfFact;
    }

    public Integer getRfPlan() {
        return this.rfPlan;
    }
    
    public void setRfPlan(Integer rfPlan) {
        this.rfPlan = rfPlan;
    }

    public Integer getRfCount() {
        return this.rfCount;
    }
    
    public void setRfCount(Integer rfCount) {
        this.rfCount = rfCount;
    }

    public Integer getRfAverage() {
        return this.rfAverage;
    }
    
    public void setRfAverage(Integer rfAverage) {
        this.rfAverage = rfAverage;
    }

    public Date getRfBegin() {
        return this.rfBegin;
    }
    
    public void setRfBegin(Date rfBegin) {
        this.rfBegin = rfBegin;
    }

    public Date getRfEnd() {
        return this.rfEnd;
    }
    
    public void setRfEnd(Date rfEnd) {
        this.rfEnd = rfEnd;
    }

    public String getRfDescription() {
        return this.rfDescription;
    }
    
    public void setRfDescription(String rfDescription) {
        this.rfDescription = rfDescription;
    }
   








}