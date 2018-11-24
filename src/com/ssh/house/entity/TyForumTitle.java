package com.ssh.house.entity;

import java.util.HashSet;
import java.util.Set;


/**
 * TyForumTitle entity. @author MyEclipse Persistence Tools
 */

public class TyForumTitle  implements java.io.Serializable {


    // Fields    

     private String ftId;
     private TyEmployee tyEmployee;
     private String ftTitle;
     private String forumContent;
     private Set tyForumBacks = new HashSet(0);


    // Constructors

    /** default constructor */
    public TyForumTitle() {
    }

    
    /** full constructor */
    public TyForumTitle(TyEmployee tyEmployee, String ftTitle, String forumContent, Set tyForumBacks) {
        this.tyEmployee = tyEmployee;
        this.ftTitle = ftTitle;
        this.forumContent = forumContent;
        this.tyForumBacks = tyForumBacks;
    }

   
    // Property accessors

    public String getFtId() {
        return this.ftId;
    }
    
    public void setFtId(String ftId) {
        this.ftId = ftId;
    }

    public TyEmployee getTyEmployee() {
        return this.tyEmployee;
    }
    
    public void setTyEmployee(TyEmployee tyEmployee) {
        this.tyEmployee = tyEmployee;
    }

    public String getFtTitle() {
        return this.ftTitle;
    }
    
    public void setFtTitle(String ftTitle) {
        this.ftTitle = ftTitle;
    }

    public String getForumContent() {
        return this.forumContent;
    }
    
    public void setForumContent(String forumContent) {
        this.forumContent = forumContent;
    }

    public Set getTyForumBacks() {
        return this.tyForumBacks;
    }
    
    public void setTyForumBacks(Set tyForumBacks) {
        this.tyForumBacks = tyForumBacks;
    }
   








}