package com.ssh.house.entity;



/**
 * Person entity. @author MyEclipse Persistence Tools
 */

public class Person  implements java.io.Serializable {


    // Fields    

     private String personid;
     private String personname;


    // Constructors

    /** default constructor */
    public Person() {
    }

    
    /** full constructor */
    public Person(String personname) {
        this.personname = personname;
    }

   
    // Property accessors

    public String getPersonid() {
        return this.personid;
    }
    
    public void setPersonid(String personid) {
        this.personid = personid;
    }

    public String getPersonname() {
        return this.personname;
    }
    
    public void setPersonname(String personname) {
        this.personname = personname;
    }
   








}