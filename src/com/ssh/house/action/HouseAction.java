package com.ssh.house.action;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.persistence.metamodel.Metamodel;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ModelDriven;
import com.ssh.house.appcomm.base.BaseAction;
import com.ssh.house.appcomm.util.Page;
import com.ssh.house.biz.HouseBizI;
import com.ssh.house.biz.StreetnumberBizI;
import com.ssh.house.biz.TypeBizI;
import com.ssh.house.biz.XiaoquBizI;
import com.ssh.house.entity.House;
import com.ssh.house.entity.Streetnumber;
import com.ssh.house.entity.Type;
import com.ssh.house.entity.Xiaoqu;

@ParentPackage(value="struts-default")
@Namespace(value="/house")
@Controller
@Scope(value="prototype")
public class HouseAction extends BaseAction  implements  ModelDriven<House> {
	
	House  h=new House();
	//Page  page=new Page();
	Integer  pageNo=1;
	Integer  pageSize=15;
	private HouseBizI houseBizI; //可以使用多个业务接口的
	private TypeBizI typeBizI;
	private StreetnumberBizI streetnumberBizI;
	private  XiaoquBizI xiaoquBizI;   //小区
	
	@Resource(name="houseBizI")
	public void setHouseBizI(HouseBizI houseBizI) {
		this.houseBizI = houseBizI;
	}
	
	@Resource(name="typeBizI")
	public void setTypeBizI(TypeBizI typeBizI) {
		this.typeBizI = typeBizI;
	}

	@Resource(name="streetnumberBizI")
	public void setStreetnumberBizI(StreetnumberBizI streetnumberBizI) {
		this.streetnumberBizI = streetnumberBizI;
	}

	
	@Resource(name="xiaoquBizI")
	public void setXiaoquBizI(XiaoquBizI xiaoquBizI) {
		this.xiaoquBizI = xiaoquBizI;
	}

	@Action(value = "toSaveHouse", results = { @Result(name = "house_edit", location = "/house_edit.jsp") })
	public String toSaveHouse() {

		List<Type> typeList = typeBizI.find("from Type");
		List<Streetnumber> streetList = streetnumberBizI.find("from Streetnumber");
		List<Xiaoqu> xiaoQuList = xiaoquBizI.find("from Xiaoqu");

		requestMap.put("typeList", typeList);
		requestMap.put("streetList", streetList);
		requestMap.put("xiaoQuList", xiaoQuList);

		return "house_edit";
	}

	/**
	 * 添加房源
	 * @return
	 */
	@Action(value = "doSaveHouse", results = { @Result(name = "result", location = "/result.jsp") })
	public String doSaveHouse() {
//		System.out.println("doSaveHouse");
		houseBizI.save(h);
		
//		System.out.println(h.getFloorage());
		String message = "添加失败";
		if(h != null && !"".equals(h)){
			message = "添加成功";
		}
		requestMap.put("message", message);
		return "result";
	}
	
	
	
	@Action(value="find",results = { @Result(name = "house_list", location = "/house_list.jsp") })
	public String  find(){


	    
	  StringBuffer hql=new StringBuffer(" from House  h");
	     //sql性能
	  	//添加查询条件
	     if(h!=null && h.getStreetnumber()!=null &&  h.getStreetnumber().getXiaoqu()!=null){
	    	 
	    	 hql.append(" where  1=1  ");
	    	 
	    	 //按小区查询
	    	 if(h.getStreetnumber().getXiaoqu().getId()!= 0){
	    		 hql.append(" and  h.streetnumber.xiaoqu.id="+h.getStreetnumber().getXiaoqu().getId());
	    	 }
	    	 
	    	 //按街道查询
	    	 if(h.getStreetnumber().getId() != 0){
	    		 hql.append(" and h.streetnumber.id = " + h.getStreetnumber().getId());
	    	 }
	    	 
	    	 //按户型
	    	 if(h.getType().getId() != 0){
	    		 hql.append(" and h.type.id = " + h.getType().getId());
	    	 }
	    	 
	    	 //按状态
	    	 if(h.getFlag() != null && !"".equals(h.getFlag())){
	    		 hql.append(" and h.flag = " + "'"+ h.getFlag() + "'");
	    	 }
	     }
		System.out.println("分页  pageNo :"+pageNo);
		
		List<House> houseList = houseBizI.find(hql.toString(),new ArrayList(),pageNo, pageSize);
		//总条件
		Integer totalCount = Integer.valueOf(houseBizI.count("select count(*) "+hql.toString()).toString());
		//总分页数
		Integer pageCount = totalCount % this.pageSize == 0 ? totalCount/ this.pageSize : totalCount / this.pageSize + 1;
		List<Xiaoqu> xiaoqulist = xiaoquBizI.find("from Xiaoqu");
		List<Streetnumber> streetnumberlist = streetnumberBizI.find("from Streetnumber");
		List<Type> typelist = typeBizI.find("from Type");
		
		requestMap.put("houseList", houseList);
		requestMap.put("h", h);
		requestMap.put("xiaoqulist", xiaoqulist);
		requestMap.put("streetnumberlist", streetnumberlist);
		requestMap.put("typelist", typelist);
		requestMap.put("pageNo", pageNo);
		requestMap.put("totalCount", totalCount);
		requestMap.put("pageCount", pageCount);	
		return "house_list";
	}
	

	@Action(value="del")
	public String  delele(){
		
		
		System.out.println(" 删除数据 "+h.getId());
		houseBizI.delete(h);
		
		
		
		return  this.find();
	}

	@Override
	public House getModel() {
		// TODO Auto-generated method stub
		return h;
	}


	public Integer getPageNo() {
		return pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}



	
	

 

 




 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
