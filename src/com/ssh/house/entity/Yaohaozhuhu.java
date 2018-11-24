package com.ssh.house.entity;

import java.util.HashSet;
import java.util.Set;


/**
 * Yaohaozhuhu entity. @author MyEclipse Persistence Tools
 */

public class Yaohaozhuhu  implements java.io.Serializable {


    // Fields    

     private Integer yaohaoId;
     private String yaohaoUsername;
     private Integer yaohaoUseridcard;
     private String yaohaoUserphone;
     private String yaohaoUseremail;
     private String yaohaoRemark;
     private Integer yaohaoTotalnum;
     private Set yaohaoconfigs = new HashSet(0);


    // Constructors

    /** default constructor */
    public Yaohaozhuhu() {
    }

    
    /** full constructor */
    public Yaohaozhuhu(String yaohaoUsername, Integer yaohaoUseridcard, String yaohaoUserphone, String yaohaoUseremail, String yaohaoRemark, Integer yaohaoTotalnum, Set yaohaoconfigs) {
        this.yaohaoUsername = yaohaoUsername;
        this.yaohaoUseridcard = yaohaoUseridcard;
        this.yaohaoUserphone = yaohaoUserphone;
        this.yaohaoUseremail = yaohaoUseremail;
        this.yaohaoRemark = yaohaoRemark;
        this.yaohaoTotalnum = yaohaoTotalnum;
        this.yaohaoconfigs = yaohaoconfigs;
    }

   
    // Property accessors

    public Integer getYaohaoId() {
        return this.yaohaoId;
    }
    
    public void setYaohaoId(Integer yaohaoId) {
        this.yaohaoId = yaohaoId;
    }

    public String getYaohaoUsername() {
        return this.yaohaoUsername;
    }
    
    public void setYaohaoUsername(String yaohaoUsername) {
        this.yaohaoUsername = yaohaoUsername;
    }

    public Integer getYaohaoUseridcard() {
        return this.yaohaoUseridcard;
    }
    
    public void setYaohaoUseridcard(Integer yaohaoUseridcard) {
        this.yaohaoUseridcard = yaohaoUseridcard;
    }

    public String getYaohaoUserphone() {
        return this.yaohaoUserphone;
    }
    
    public void setYaohaoUserphone(String yaohaoUserphone) {
        this.yaohaoUserphone = yaohaoUserphone;
    }

    public String getYaohaoUseremail() {
        return this.yaohaoUseremail;
    }
    
    public void setYaohaoUseremail(String yaohaoUseremail) {
        this.yaohaoUseremail = yaohaoUseremail;
    }

    public String getYaohaoRemark() {
        return this.yaohaoRemark;
    }
    
    public void setYaohaoRemark(String yaohaoRemark) {
        this.yaohaoRemark = yaohaoRemark;
    }

    public Integer getYaohaoTotalnum() {
        return this.yaohaoTotalnum;
    }
    
    public void setYaohaoTotalnum(Integer yaohaoTotalnum) {
        this.yaohaoTotalnum = yaohaoTotalnum;
    }

    public Set getYaohaoconfigs() {
        return this.yaohaoconfigs;
    }
    
    public void setYaohaoconfigs(Set yaohaoconfigs) {
        this.yaohaoconfigs = yaohaoconfigs;
    }
   








}