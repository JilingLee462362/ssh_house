package com.ssh.house.entity;



/**
 * TyOffiche entity. @author MyEclipse Persistence Tools
 */

public class TyOffiche  implements java.io.Serializable {


    // Fields    

     private Integer offId;
     private TyEmployee tyEmployee;
     private String offTitle;
     private String offContent;


    // Constructors

    /** default constructor */
    public TyOffiche() {
    }

    
    /** full constructor */
    public TyOffiche(TyEmployee tyEmployee, String offTitle, String offContent) {
        this.tyEmployee = tyEmployee;
        this.offTitle = offTitle;
        this.offContent = offContent;
    }

   
    // Property accessors

    public Integer getOffId() {
        return this.offId;
    }
    
    public void setOffId(Integer offId) {
        this.offId = offId;
    }

    public TyEmployee getTyEmployee() {
        return this.tyEmployee;
    }
    
    public void setTyEmployee(TyEmployee tyEmployee) {
        this.tyEmployee = tyEmployee;
    }

    public String getOffTitle() {
        return this.offTitle;
    }
    
    public void setOffTitle(String offTitle) {
        this.offTitle = offTitle;
    }

    public String getOffContent() {
        return this.offContent;
    }
    
    public void setOffContent(String offContent) {
        this.offContent = offContent;
    }


	








}