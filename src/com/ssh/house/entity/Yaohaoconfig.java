package com.ssh.house.entity;

import java.sql.Timestamp;


/**
 * Yaohaoconfig entity. @author MyEclipse Persistence Tools
 */

public class Yaohaoconfig  implements java.io.Serializable {


    // Fields    

     private Integer yaohaoconfigId;
     private Yaohaozhuhu yaohaozhuhu;
     private Yaohaohouse yaohaohouse;
     private Timestamp yaohaoTime;
     private String yaohaoBatch;
     private String yaohaoAddr;
     private String yaohaoSupervisor;


    // Constructors

    /** default constructor */
    public Yaohaoconfig() {
    }

    
    /** full constructor */
    public Yaohaoconfig(Yaohaozhuhu yaohaozhuhu, Yaohaohouse yaohaohouse, Timestamp yaohaoTime, String yaohaoBatch, String yaohaoAddr, String yaohaoSupervisor) {
        this.yaohaozhuhu = yaohaozhuhu;
        this.yaohaohouse = yaohaohouse;
        this.yaohaoTime = yaohaoTime;
        this.yaohaoBatch = yaohaoBatch;
        this.yaohaoAddr = yaohaoAddr;
        this.yaohaoSupervisor = yaohaoSupervisor;
    }

   
    // Property accessors

    public Integer getYaohaoconfigId() {
        return this.yaohaoconfigId;
    }
    
    public void setYaohaoconfigId(Integer yaohaoconfigId) {
        this.yaohaoconfigId = yaohaoconfigId;
    }

    public Yaohaozhuhu getYaohaozhuhu() {
        return this.yaohaozhuhu;
    }
    
    public void setYaohaozhuhu(Yaohaozhuhu yaohaozhuhu) {
        this.yaohaozhuhu = yaohaozhuhu;
    }

    public Yaohaohouse getYaohaohouse() {
        return this.yaohaohouse;
    }
    
    public void setYaohaohouse(Yaohaohouse yaohaohouse) {
        this.yaohaohouse = yaohaohouse;
    }

    public Timestamp getYaohaoTime() {
        return this.yaohaoTime;
    }
    
    public void setYaohaoTime(Timestamp yaohaoTime) {
        this.yaohaoTime = yaohaoTime;
    }

    public String getYaohaoBatch() {
        return this.yaohaoBatch;
    }
    
    public void setYaohaoBatch(String yaohaoBatch) {
        this.yaohaoBatch = yaohaoBatch;
    }

    public String getYaohaoAddr() {
        return this.yaohaoAddr;
    }
    
    public void setYaohaoAddr(String yaohaoAddr) {
        this.yaohaoAddr = yaohaoAddr;
    }

    public String getYaohaoSupervisor() {
        return this.yaohaoSupervisor;
    }
    
    public void setYaohaoSupervisor(String yaohaoSupervisor) {
        this.yaohaoSupervisor = yaohaoSupervisor;
    }
   








}