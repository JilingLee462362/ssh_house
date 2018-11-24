package com.ssh.house.entity;

import java.util.HashSet;
import java.util.Set;


/**
 * Streetnumber entity. @author MyEclipse Persistence Tools
 */

public class Streetnumber  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Xiaoqu xiaoqu;
     private String name;
     private Set houses = new HashSet(0);


    // Constructors

    /** default constructor */
    public Streetnumber() {
    }

    
    /** full constructor */
    public Streetnumber(Xiaoqu xiaoqu, String name, Set houses) {
        this.xiaoqu = xiaoqu;
        this.name = name;
        this.houses = houses;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public Xiaoqu getXiaoqu() {
        return this.xiaoqu;
    }
    
    public void setXiaoqu(Xiaoqu xiaoqu) {
        this.xiaoqu = xiaoqu;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public Set getHouses() {
        return this.houses;
    }
    
    public void setHouses(Set houses) {
        this.houses = houses;
    }
   








}