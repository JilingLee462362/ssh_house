package com.ssh.house.entity;

import java.util.HashSet;
import java.util.Set;


/**
 * Xiaoqu entity. @author MyEclipse Persistence Tools
 */

public class Xiaoqu  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private String name;
     private Set streetnumbers = new HashSet(0);


    // Constructors

    /** default constructor */
    public Xiaoqu() {
    }

	/** minimal constructor */
    public Xiaoqu(String name) {
        this.name = name;
    }
    
    /** full constructor */
    public Xiaoqu(String name, Set streetnumbers) {
        this.name = name;
        this.streetnumbers = streetnumbers;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public Set getStreetnumbers() {
        return this.streetnumbers;
    }
    
    public void setStreetnumbers(Set streetnumbers) {
        this.streetnumbers = streetnumbers;
    }
   








}