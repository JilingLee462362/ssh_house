package com.ssh.house.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * TyPosition entity. @author MyEclipse Persistence Tools
 */

public class TyPosition implements java.io.Serializable {

	// Fields

	private Integer positionid;
	private String positionname;
	private Set tyEmployees = new HashSet(0);

	// Constructors

	/** default constructor */
	public TyPosition() {
	}

	/** full constructor */
	public TyPosition(String positionname, Set tyEmployees) {
		this.positionname = positionname;
		this.tyEmployees = tyEmployees;
	}

	// Property accessors

	public Integer getPositionid() {
		return this.positionid;
	}

	public void setPositionid(Integer positionid) {
		this.positionid = positionid;
	}

	public String getPositionname() {
		return this.positionname;
	}

	public void setPositionname(String positionname) {
		this.positionname = positionname;
	}

	public Set getTyEmployees() {
		return this.tyEmployees;
	}

	public void setTyEmployees(Set tyEmployees) {
		this.tyEmployees = tyEmployees;
	}

}