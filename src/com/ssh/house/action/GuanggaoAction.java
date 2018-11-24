package com.ssh.house.action;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.enterprise.inject.New;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ModelDriven;
import com.ssh.house.appcomm.base.BaseAction;
import com.ssh.house.appcomm.util.Page;
import com.ssh.house.biz.GuanggaoBizI;
import com.ssh.house.entity.Guanggao;

@ParentPackage(value="struts-default")
@Namespace("/g")
@Controller
public class GuanggaoAction extends BaseAction implements ModelDriven<Guanggao> {

	Guanggao guanggao = new Guanggao();
	Integer pageNum=1;//页码
	Integer pageSize=10;//页面大小
	String deleteString = null;//批量删除
	
	
	public String getDeleteString() {
		return deleteString;
	}


	public void setDeleteString(String deleteString) {
		this.deleteString = deleteString;
	}
	
	GuanggaoBizI guanggaoBizI;

	@Resource(name="guanggaoBizI")
	public void setGuanggaoBizI(GuanggaoBizI guanggaoBizI) {
		this.guanggaoBizI = guanggaoBizI;
	}


	public Integer getPageNum() {
		return pageNum;
	}


	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}


	public Integer getPageSize() {
		return pageSize;
	}


	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}


	@Override
	public Guanggao getModel() {
		// TODO Auto-generated method stub
		return guanggao;
	}
	
	/**
	 * 分页查询
	 * @return
	 */
	@Action(value="guanggao",results={@Result(name="guanggao",location="/guanggao.jsp")})
	public String search(){
		
		int m = Integer.valueOf(guanggaoBizI.count("select count(*) from Guanggao").toString());
		int count = m%10 ==0?m/10:m/10+1;
		System.out.println(pageNum);
		if (pageNum<1) {
			pageNum=1;
		}
		if (pageNum>count) {
			pageNum=count;
		}
			
		
		 List<Guanggao> guanggaoList = guanggaoBizI.find("from Guanggao", new ArrayList<Object>(), pageNum, pageSize);
		requestMap.put("guanggaoList",guanggaoList);
		requestMap.put("pageNum",pageNum);
		requestMap.put("count",count);
		return "guanggao";
		
	}
	@Action(value="delete",results={@Result(name="guanggao",location="/guanggao.jsp")})
	public String delete(){
		/**
		 * 批量删除
		 */
		if (deleteString != null) {
			System.out.println(deleteString);
			String[] strings = deleteString.split(",");
			for (int i = 0; i < strings.length; i++) {
				guanggao.setGgid(Integer.valueOf(strings[i]));
				guanggaoBizI.delete(guanggao);
			}
			
		} else {
			/**
			 * 删除单个数据
			 */
			System.out.println(guanggao.getGgid());
			guanggaoBizI.delete(guanggao);
		}
		return this.search();
	}
	/**
	 * 更新或添加广告
	 * @return
	 */
	@Action(value="update",results={@Result(name="guanggao",location="/guanggao.jsp"),@Result(name="edit",location="/guanggao_edit.jsp")})
	public String update(){
		
		if (guanggao.getGgid()!=null) {
			/**
			 * 编辑广告
			 */
			Guanggao guanggao2 = guanggaoBizI.get(Guanggao.class,guanggao.getGgid());
			requestMap.put("guanggao2", guanggao2);
			return "edit";
			
		}else {
			/**
			 * 更新或添加广告
			 */
			guanggaoBizI.saveOrUpdate(guanggao);
			return this.search();
		}
		
		
	}
	
}
