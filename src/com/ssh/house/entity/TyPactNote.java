package com.ssh.house.entity;

import java.util.Date;


/**
 * TyPactNote entity. @author MyEclipse Persistence Tools
 */

public class TyPactNote  implements java.io.Serializable {


    // Fields    

     private Integer pnId;
     private Integer pnCustomerId;
     private String pnName;
     private String pnDeputy;
     private Date pnDate;
     private String pnDescription;

     
     
     
    // Constructors

    @Override
	public String toString() {
		return "TyPactNote [pnId=" + pnId + ", pnCustomerId=" + pnCustomerId + ", pnName=" + pnName + ", pnDeputy="
				+ pnDeputy + ", pnDate=" + pnDate + ", pnDescription=" + pnDescription + "]";
	}


	/** default constructor */
    public TyPactNote() {
    }

    
    /** full constructor */
    public TyPactNote(Integer pnCustomerId, String pnName, String pnDeputy, Date pnDate, String pnDescription) {
        this.pnCustomerId = pnCustomerId;
        this.pnName = pnName;
        this.pnDeputy = pnDeputy;
        this.pnDate = pnDate;
        this.pnDescription = pnDescription;
    }

   
    // Property accessors

    public Integer getPnId() {
        return this.pnId;
    }
    
    public void setPnId(Integer pnId) {
        this.pnId = pnId;
    }

    public Integer getPnCustomerId() {
        return this.pnCustomerId;
    }
    
    public void setPnCustomerId(Integer pnCustomerId) {
        this.pnCustomerId = pnCustomerId;
    }

    public String getPnName() {
        return this.pnName;
    }
    
    public void setPnName(String pnName) {
        this.pnName = pnName;
    }

    public String getPnDeputy() {
        return this.pnDeputy;
    }
    
    public void setPnDeputy(String pnDeputy) {
        this.pnDeputy = pnDeputy;
    }

    public Date getPnDate() {
        return this.pnDate;
    }
    
    public void setPnDate(Date pnDate) {
        this.pnDate = pnDate;
    }

    public String getPnDescription() {
        return this.pnDescription;
    }
    
    public void setPnDescription(String pnDescription) {
        this.pnDescription = pnDescription;
    }
   








}