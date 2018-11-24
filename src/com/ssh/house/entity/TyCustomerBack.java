package com.ssh.house.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * TyCustomerBack entity. @author MyEclipse Persistence Tools
 */

public class TyCustomerBack  implements java.io.Serializable {


    // Fields    

     private Integer cusid;
     private String cusname;
     private String cuspwd;
     private String cusCard;
     private String teltphono;
     private String address;
     private String email;
     private String desire;
     private Date savedate;
     private Set tyCustomerPromises = new HashSet(0);


    // Constructors

    /** default constructor */
    public TyCustomerBack() {
    }

    
    /** full constructor */
    public TyCustomerBack(String cusname, String cuspwd, String cusCard, String teltphono, String address, String email, String desire, Date savedate, Set tyCustomerPromises) {
        this.cusname = cusname;
        this.cuspwd = cuspwd;
        this.cusCard = cusCard;
        this.teltphono = teltphono;
        this.address = address;
        this.email = email;
        this.desire = desire;
        this.savedate = savedate;
        this.tyCustomerPromises = tyCustomerPromises;
    }

   
    // Property accessors

    public Integer getCusid() {
        return this.cusid;
    }
    
    public void setCusid(Integer cusid) {
        this.cusid = cusid;
    }

    public String getCusname() {
        return this.cusname;
    }
    
    public void setCusname(String cusname) {
        this.cusname = cusname;
    }

    public String getCuspwd() {
        return this.cuspwd;
    }
    
    public void setCuspwd(String cuspwd) {
        this.cuspwd = cuspwd;
    }

    public String getCusCard() {
        return this.cusCard;
    }
    
    public void setCusCard(String cusCard) {
        this.cusCard = cusCard;
    }

    public String getTeltphono() {
        return this.teltphono;
    }
    
    public void setTeltphono(String teltphono) {
        this.teltphono = teltphono;
    }

    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public String getDesire() {
        return this.desire;
    }
    
    public void setDesire(String desire) {
        this.desire = desire;
    }

    public Date getSavedate() {
        return this.savedate;
    }
    
    public void setSavedate(Date savedate) {
        this.savedate = savedate;
    }

    public Set getTyCustomerPromises() {
        return this.tyCustomerPromises;
    }
    
    public void setTyCustomerPromises(Set tyCustomerPromises) {
        this.tyCustomerPromises = tyCustomerPromises;
    }
   








}