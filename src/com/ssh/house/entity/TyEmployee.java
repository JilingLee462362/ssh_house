package com.ssh.house.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * TyEmployee entity. @author MyEclipse Persistence Tools
 */

public class TyEmployee implements java.io.Serializable {

	// Fields

	private Integer employeeid;
	private TyPosition tyPosition;
	private String employeename;
	private Integer departid;
	private String sex;
	private Integer age;
	private String empIdentity;
	private Date birth;
	private Integer phone;
	private Set tyDealNotes = new HashSet(0);
	private Set tyForumBacks = new HashSet(0);
	private Set tyInstalmentApplies = new HashSet(0);
	private Set tyForumTitles = new HashSet(0);
	private Set tyReportFormses = new HashSet(0);
	private Set tyOffiches = new HashSet(0);
	private Set tyNewses = new HashSet(0);

	// Constructors

	/** default constructor */
	public TyEmployee() {
	}

	/** full constructor */
	public TyEmployee(TyPosition tyPosition, String employeename, Integer departid, String sex, Integer age,
			String empIdentity, Date birth, Integer phone, Set tyDealNotes, Set tyForumBacks, Set tyInstalmentApplies,
			Set tyForumTitles, Set tyReportFormses, Set tyOffiches, Set tyNewses) {
		this.tyPosition = tyPosition;
		this.employeename = employeename;
		this.departid = departid;
		this.sex = sex;
		this.age = age;
		this.empIdentity = empIdentity;
		this.birth = birth;
		this.phone = phone;
		this.tyDealNotes = tyDealNotes;
		this.tyForumBacks = tyForumBacks;
		this.tyInstalmentApplies = tyInstalmentApplies;
		this.tyForumTitles = tyForumTitles;
		this.tyReportFormses = tyReportFormses;
		this.tyOffiches = tyOffiches;
		this.tyNewses = tyNewses;
	}

	// Property accessors

	public Integer getEmployeeid() {
		return this.employeeid;
	}

	public void setEmployeeid(Integer employeeid) {
		this.employeeid = employeeid;
	}

	public TyPosition getTyPosition() {
		return this.tyPosition;
	}

	public void setTyPosition(TyPosition tyPosition) {
		this.tyPosition = tyPosition;
	}

	public String getEmployeename() {
		return this.employeename;
	}

	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}

	public Integer getDepartid() {
		return this.departid;
	}

	public void setDepartid(Integer departid) {
		this.departid = departid;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEmpIdentity() {
		return this.empIdentity;
	}

	public void setEmpIdentity(String empIdentity) {
		this.empIdentity = empIdentity;
	}

	public Date getBirth() {
		return this.birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public Integer getPhone() {
		return this.phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public Set getTyDealNotes() {
		return this.tyDealNotes;
	}

	public void setTyDealNotes(Set tyDealNotes) {
		this.tyDealNotes = tyDealNotes;
	}

	public Set getTyForumBacks() {
		return this.tyForumBacks;
	}

	public void setTyForumBacks(Set tyForumBacks) {
		this.tyForumBacks = tyForumBacks;
	}

	public Set getTyInstalmentApplies() {
		return this.tyInstalmentApplies;
	}

	public void setTyInstalmentApplies(Set tyInstalmentApplies) {
		this.tyInstalmentApplies = tyInstalmentApplies;
	}

	public Set getTyForumTitles() {
		return this.tyForumTitles;
	}

	public void setTyForumTitles(Set tyForumTitles) {
		this.tyForumTitles = tyForumTitles;
	}

	public Set getTyReportFormses() {
		return this.tyReportFormses;
	}

	public void setTyReportFormses(Set tyReportFormses) {
		this.tyReportFormses = tyReportFormses;
	}

	public Set getTyOffiches() {
		return this.tyOffiches;
	}

	public void setTyOffiches(Set tyOffiches) {
		this.tyOffiches = tyOffiches;
	}

	public Set getTyNewses() {
		return this.tyNewses;
	}

	public void setTyNewses(Set tyNewses) {
		this.tyNewses = tyNewses;
	}

}