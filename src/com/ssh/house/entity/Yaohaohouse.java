package com.ssh.house.entity;

import java.util.HashSet;
import java.util.Set;


/**
 * Yaohaohouse entity. @author MyEclipse Persistence Tools
 */

public class Yaohaohouse  implements java.io.Serializable {


    // Fields    

     private Integer yaohaoHouseid;
     private Type type;
     private Integer yaohaoHousestree;
     private String yaohaoTitle;
     private String yaohaoDescription;
     private Integer yaohaoPrice;
     private Integer yaohaoFloorage;
     private String yaohaoContact;
     private Set yaohaoconfigs = new HashSet(0);


    // Constructors

    /** default constructor */
    public Yaohaohouse() {
    }

    
    /** full constructor */
    public Yaohaohouse(Type type, Integer yaohaoHousestree, String yaohaoTitle, String yaohaoDescription, Integer yaohaoPrice, Integer yaohaoFloorage, String yaohaoContact, Set yaohaoconfigs) {
        this.type = type;
        this.yaohaoHousestree = yaohaoHousestree;
        this.yaohaoTitle = yaohaoTitle;
        this.yaohaoDescription = yaohaoDescription;
        this.yaohaoPrice = yaohaoPrice;
        this.yaohaoFloorage = yaohaoFloorage;
        this.yaohaoContact = yaohaoContact;
        this.yaohaoconfigs = yaohaoconfigs;
    }

   
    // Property accessors

    public Integer getYaohaoHouseid() {
        return this.yaohaoHouseid;
    }
    
    public void setYaohaoHouseid(Integer yaohaoHouseid) {
        this.yaohaoHouseid = yaohaoHouseid;
    }

    public Type getType() {
        return this.type;
    }
    
    public void setType(Type type) {
        this.type = type;
    }

    public Integer getYaohaoHousestree() {
        return this.yaohaoHousestree;
    }
    
    public void setYaohaoHousestree(Integer yaohaoHousestree) {
        this.yaohaoHousestree = yaohaoHousestree;
    }

    public String getYaohaoTitle() {
        return this.yaohaoTitle;
    }
    
    public void setYaohaoTitle(String yaohaoTitle) {
        this.yaohaoTitle = yaohaoTitle;
    }

    public String getYaohaoDescription() {
        return this.yaohaoDescription;
    }
    
    public void setYaohaoDescription(String yaohaoDescription) {
        this.yaohaoDescription = yaohaoDescription;
    }

    public Integer getYaohaoPrice() {
        return this.yaohaoPrice;
    }
    
    public void setYaohaoPrice(Integer yaohaoPrice) {
        this.yaohaoPrice = yaohaoPrice;
    }

    public Integer getYaohaoFloorage() {
        return this.yaohaoFloorage;
    }
    
    public void setYaohaoFloorage(Integer yaohaoFloorage) {
        this.yaohaoFloorage = yaohaoFloorage;
    }

    public String getYaohaoContact() {
        return this.yaohaoContact;
    }
    
    public void setYaohaoContact(String yaohaoContact) {
        this.yaohaoContact = yaohaoContact;
    }

    public Set getYaohaoconfigs() {
        return this.yaohaoconfigs;
    }
    
    public void setYaohaoconfigs(Set yaohaoconfigs) {
        this.yaohaoconfigs = yaohaoconfigs;
    }
   








}