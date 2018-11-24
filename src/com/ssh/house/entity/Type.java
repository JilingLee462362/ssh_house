package com.ssh.house.entity;

import java.util.HashSet;
import java.util.Set;


/**
 * Type entity. @author MyEclipse Persistence Tools
 */

public class Type  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private String type;
     private Set houses = new HashSet(0);
     private Set yaohaohouses = new HashSet(0);


    // Constructors

    /** default constructor */
    public Type() {
    }

	/** minimal constructor */
    public Type(String type) {
        this.type = type;
    }
    
    /** full constructor */
    public Type(String type, Set houses, Set yaohaohouses) {
        this.type = type;
        this.houses = houses;
        this.yaohaohouses = yaohaohouses;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public Set getHouses() {
        return this.houses;
    }
    
    public void setHouses(Set houses) {
        this.houses = houses;
    }

    public Set getYaohaohouses() {
        return this.yaohaohouses;
    }
    
    public void setYaohaohouses(Set yaohaohouses) {
        this.yaohaohouses = yaohaohouses;
    }
   








}