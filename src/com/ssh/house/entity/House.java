package com.ssh.house.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * House entity. @author MyEclipse Persistence Tools
 */

public class House  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Userinfo userinfo;
     private Streetnumber streetnumber;
     private Type type;
     private String title;
     private String description;
     private Integer price;
     private Date pubdate;
     private Integer floorage;
     private String contact;
     private String flag;
     private Set tyCustomerPromises = new HashSet(0);


    // Constructors

    /** default constructor */
    public House() {
    }

    
    /** full constructor */
    public House(Userinfo userinfo, Streetnumber streetnumber, Type type, String title, String description, Integer price, Date pubdate, Integer floorage, String contact, String flag, Set tyCustomerPromises) {
        this.userinfo = userinfo;
        this.streetnumber = streetnumber;
        this.type = type;
        this.title = title;
        this.description = description;
        this.price = price;
        this.pubdate = pubdate;
        this.floorage = floorage;
        this.contact = contact;
        this.flag = flag;
        this.tyCustomerPromises = tyCustomerPromises;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public Userinfo getUserinfo() {
        return this.userinfo;
    }
    
    public void setUserinfo(Userinfo userinfo) {
        this.userinfo = userinfo;
    }

    public Streetnumber getStreetnumber() {
        return this.streetnumber;
    }
    
    public void setStreetnumber(Streetnumber streetnumber) {
        this.streetnumber = streetnumber;
    }

    public Type getType() {
        return this.type;
    }
    
    public void setType(Type type) {
        this.type = type;
    }

    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPrice() {
        return this.price;
    }
    
    public void setPrice(Integer price) {
        this.price = price;
    }

    public Date getPubdate() {
        return this.pubdate;
    }
    
    public void setPubdate(Date pubdate) {
        this.pubdate = pubdate;
    }

    public Integer getFloorage() {
        return this.floorage;
    }
    
    public void setFloorage(Integer floorage) {
        this.floorage = floorage;
    }

    public String getContact() {
        return this.contact;
    }
    
    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getFlag() {
        return this.flag;
    }
    
    public void setFlag(String flag) {
        this.flag = flag;
    }

    public Set getTyCustomerPromises() {
        return this.tyCustomerPromises;
    }
    
    public void setTyCustomerPromises(Set tyCustomerPromises) {
        this.tyCustomerPromises = tyCustomerPromises;
    }
   








}