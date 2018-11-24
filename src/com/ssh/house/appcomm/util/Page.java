package com.ssh.house.appcomm.util;

import java.util.List;
/**
 * 伪分页（js）
 * @author tzhu

 *
 */
public class Page {
	private int totalCount=0;// 总的记录 count(*)
	private int pageSize=15;// 页面的条
	private int pageCount=0; // 页面总数
	private int pageNo=1; // 当前

	public Page() {
		//System.out.println("----------分页类被初始----------------- ");
	
	}

	public Page(int pageNo, int pageSize) {
		this.pageNo = pageNo > 1 ? pageNo : 1;
		this.pageSize = pageSize;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public int getPageNo() {
		if (pageNo > pageCount)
			this.pageNo = pageCount;
		if (pageNo < 1)
			pageNo = 1;
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
		if (totalCount == 0)
			this.pageCount = 0;
		else {
			this.pageCount = totalCount % this.pageSize == 0 ? totalCount
					/ this.pageSize : totalCount / this.pageSize + 1;
		}
		if (pageNo > pageCount) {
			pageNo = pageCount;
		}
	}

	@Override
	public String toString() {
		return "Page [totalCount=" + totalCount + ", pageSize=" + pageSize
				+ ", pageCount=" + pageCount + ", pageNo=" + pageNo + "]";
	}

	
	
}
