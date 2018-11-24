package com.ssh.house.entity;

import java.util.HashSet;
import java.util.Set;


/**
 * TyDepartment entity. @author MyEclipse Persistence Tools
 */

public class TyDepartment  implements java.io.Serializable {


    // Fields    

     private Integer departid;
     private String departname;
     private Set tySellPlans = new HashSet(0);


    // Constructors

    /** default constructor */
    public TyDepartment() {
    }

    
    /** full constructor */
    public TyDepartment(String departname, Set tySellPlans) {
        this.departname = departname;
        this.tySellPlans = tySellPlans;
    }

   
    // Property accessors

    public Integer getDepartid() {
        return this.departid;
    }
    
    public void setDepartid(Integer departid) {
        this.departid = departid;
    }

    public String getDepartname() {
        return this.departname;
    }
    
    public void setDepartname(String departname) {
        this.departname = departname;
    }

    public Set getTySellPlans() {
        return this.tySellPlans;
    }
    
    public void setTySellPlans(Set tySellPlans) {
        this.tySellPlans = tySellPlans;
    }
   








}