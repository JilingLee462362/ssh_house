package com.ssh.house.entity;

import java.util.HashSet;
import java.util.Set;


/**
 * Userinfo entity. @author MyEclipse Persistence Tools
 */

public class Userinfo  implements java.io.Serializable {


    // Fields    

     private Integer userid;
     private String username;
     private String userpass;
     private String userfamily;
     private String userphone;
     private String usermail;
     private Set houses = new HashSet(0);


    // Constructors

    /** default constructor */
    public Userinfo() {
    }

    
    /** full constructor */
    public Userinfo(String username, String userpass, String userfamily, String userphone, String usermail, Set houses) {
        this.username = username;
        this.userpass = userpass;
        this.userfamily = userfamily;
        this.userphone = userphone;
        this.usermail = usermail;
        this.houses = houses;
    }

   
    // Property accessors

    public Integer getUserid() {
        return this.userid;
    }
    
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpass() {
        return this.userpass;
    }
    
    public void setUserpass(String userpass) {
        this.userpass = userpass;
    }

    public String getUserfamily() {
        return this.userfamily;
    }
    
    public void setUserfamily(String userfamily) {
        this.userfamily = userfamily;
    }

    public String getUserphone() {
        return this.userphone;
    }
    
    public void setUserphone(String userphone) {
        this.userphone = userphone;
    }

    public String getUsermail() {
        return this.usermail;
    }
    
    public void setUsermail(String usermail) {
        this.usermail = usermail;
    }

    public Set getHouses() {
        return this.houses;
    }
    
    public void setHouses(Set houses) {
        this.houses = houses;
    }
   








}