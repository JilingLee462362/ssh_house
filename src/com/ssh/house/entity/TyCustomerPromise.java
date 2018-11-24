package com.ssh.house.entity;

import java.util.Date;


/**
 * TyCustomerPromise entity. @author MyEclipse Persistence Tools
 */

public class TyCustomerPromise  implements java.io.Serializable {


    // Fields    

     private Integer cpId;
     private TyCustomerBack tyCustomerBack;
     private House house;
     private String cpWhether;
     private String cpAlreadyPromise;
     private Date cpDate;
     private Integer cpPrice;
     private String cpStatus;
     private String cpProcedure;


    // Constructors

    /** default constructor */
    public TyCustomerPromise() {
    }

    
    /** full constructor */
    public TyCustomerPromise(TyCustomerBack tyCustomerBack, House house, String cpWhether, String cpAlreadyPromise, Date cpDate, Integer cpPrice, String cpStatus, String cpProcedure) {
        this.tyCustomerBack = tyCustomerBack;
        this.house = house;
        this.cpWhether = cpWhether;
        this.cpAlreadyPromise = cpAlreadyPromise;
        this.cpDate = cpDate;
        this.cpPrice = cpPrice;
        this.cpStatus = cpStatus;
        this.cpProcedure = cpProcedure;
    }

   
    // Property accessors

    public Integer getCpId() {
        return this.cpId;
    }
    
    public void setCpId(Integer cpId) {
        this.cpId = cpId;
    }

    public TyCustomerBack getTyCustomerBack() {
        return this.tyCustomerBack;
    }
    
    public void setTyCustomerBack(TyCustomerBack tyCustomerBack) {
        this.tyCustomerBack = tyCustomerBack;
    }

    public House getHouse() {
        return this.house;
    }
    
    public void setHouse(House house) {
        this.house = house;
    }

    public String getCpWhether() {
        return this.cpWhether;
    }
    
    public void setCpWhether(String cpWhether) {
        this.cpWhether = cpWhether;
    }

    public String getCpAlreadyPromise() {
        return this.cpAlreadyPromise;
    }
    
    public void setCpAlreadyPromise(String cpAlreadyPromise) {
        this.cpAlreadyPromise = cpAlreadyPromise;
    }

    public Date getCpDate() {
        return this.cpDate;
    }
    
    public void setCpDate(Date cpDate) {
        this.cpDate = cpDate;
    }

    public Integer getCpPrice() {
        return this.cpPrice;
    }
    
    public void setCpPrice(Integer cpPrice) {
        this.cpPrice = cpPrice;
    }

    public String getCpStatus() {
        return this.cpStatus;
    }
    
    public void setCpStatus(String cpStatus) {
        this.cpStatus = cpStatus;
    }

    public String getCpProcedure() {
        return this.cpProcedure;
    }
    
    public void setCpProcedure(String cpProcedure) {
        this.cpProcedure = cpProcedure;
    }
   








}