package com.ssh.house.entity;



/**
 * Guanggao entity. @author MyEclipse Persistence Tools
 */

public class Guanggao  implements java.io.Serializable {


    // Fields    

     private Integer ggid;
     private String ggtitle;
     private String ggimg;
     private String ggurl;
     private Integer ggtime;


    // Constructors

    /** default constructor */
    public Guanggao() {
    }

    
    /** full constructor */
    public Guanggao(String ggtitle, String ggimg, String ggurl, Integer ggtime) {
        this.ggtitle = ggtitle;
        this.ggimg = ggimg;
        this.ggurl = ggurl;
        this.ggtime = ggtime;
    }

   
    // Property accessors

    public Integer getGgid() {
        return this.ggid;
    }
    
    public void setGgid(Integer ggid) {
        this.ggid = ggid;
    }

    public String getGgtitle() {
        return this.ggtitle;
    }
    
    public void setGgtitle(String ggtitle) {
        this.ggtitle = ggtitle;
    }

    public String getGgimg() {
        return this.ggimg;
    }
    
    public void setGgimg(String ggimg) {
        this.ggimg = ggimg;
    }

    public String getGgurl() {
        return this.ggurl;
    }
    
    public void setGgurl(String ggurl) {
        this.ggurl = ggurl;
    }

    public Integer getGgtime() {
        return this.ggtime;
    }
    
    public void setGgtime(Integer ggtime) {
        this.ggtime = ggtime;
    }
   








}