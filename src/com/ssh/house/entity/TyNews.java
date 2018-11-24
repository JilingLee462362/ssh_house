package com.ssh.house.entity;

/**
 * TyNews entity. @author MyEclipse Persistence Tools
 */

public class TyNews implements java.io.Serializable {

	// Fields

	private Integer newsId;
	private TyEmployee tyEmployee;
	private String newsTitle;
	private String newsContent;

	// Constructors

	/** default constructor */
	public TyNews() {
	}

	/** full constructor */
	public TyNews(TyEmployee tyEmployee, String newsTitle, String newsContent) {
		this.tyEmployee = tyEmployee;
		this.newsTitle = newsTitle;
		this.newsContent = newsContent;
	}

	// Property accessors

	public Integer getNewsId() {
		return this.newsId;
	}

	public void setNewsId(Integer newsId) {
		this.newsId = newsId;
	}

	public TyEmployee getTyEmployee() {
		return this.tyEmployee;
	}

	public void setTyEmployee(TyEmployee tyEmployee) {
		this.tyEmployee = tyEmployee;
	}

	public String getNewsTitle() {
		return this.newsTitle;
	}

	public void setNewsTitle(String newsTitle) {
		this.newsTitle = newsTitle;
	}

	public String getNewsContent() {
		return this.newsContent;
	}

	public void setNewsContent(String newsContent) {
		this.newsContent = newsContent;
	}

}