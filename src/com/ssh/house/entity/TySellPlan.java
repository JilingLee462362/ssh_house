package com.ssh.house.entity;

import java.util.Date;


/**
 * TySellPlan entity. @author MyEclipse Persistence Tools
 */

public class TySellPlan  implements java.io.Serializable {


    // Fields    

     private Integer spId;
     private TyDepartment tyDepartment;
     private String spName;
     private Date spBegin;
     private Date spEnd;
     private Integer spSold;
     private Integer spPlan;
     private String spDetail;


    // Constructors

    /** default constructor */
    public TySellPlan() {
    }

    
    /** full constructor */
    public TySellPlan(TyDepartment tyDepartment, String spName, Date spBegin, Date spEnd, Integer spSold, Integer spPlan, String spDetail) {
        this.tyDepartment = tyDepartment;
        this.spName = spName;
        this.spBegin = spBegin;
        this.spEnd = spEnd;
        this.spSold = spSold;
        this.spPlan = spPlan;
        this.spDetail = spDetail;
    }

   
    // Property accessors

    public Integer getSpId() {
        return this.spId;
    }
    
    public void setSpId(Integer spId) {
        this.spId = spId;
    }

    public TyDepartment getTyDepartment() {
        return this.tyDepartment;
    }
    
    public void setTyDepartment(TyDepartment tyDepartment) {
        this.tyDepartment = tyDepartment;
    }

    public String getSpName() {
        return this.spName;
    }
    
    public void setSpName(String spName) {
        this.spName = spName;
    }

    public Date getSpBegin() {
        return this.spBegin;
    }
    
    public void setSpBegin(Date spBegin) {
        this.spBegin = spBegin;
    }

    public Date getSpEnd() {
        return this.spEnd;
    }
    
    public void setSpEnd(Date spEnd) {
        this.spEnd = spEnd;
    }

    public Integer getSpSold() {
        return this.spSold;
    }
    
    public void setSpSold(Integer spSold) {
        this.spSold = spSold;
    }

    public Integer getSpPlan() {
        return this.spPlan;
    }
    
    public void setSpPlan(Integer spPlan) {
        this.spPlan = spPlan;
    }

    public String getSpDetail() {
        return this.spDetail;
    }
    
    public void setSpDetail(String spDetail) {
        this.spDetail = spDetail;
    }
   








}