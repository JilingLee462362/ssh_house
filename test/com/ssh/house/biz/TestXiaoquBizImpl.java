package com.ssh.house.biz;

import org.junit.Test;

import com.ssh.house.appcomm.SpringUtils;
import com.ssh.house.entity.Xiaoqu;
/**
 * 测试类，测试XiaoquBiz
 * @author Administrator
 *
 */
public class TestXiaoquBizImpl {

	XiaoquBizI xiaoquBizI = SpringUtils.getBean("xiaoquBizI", XiaoquBizI.class);
	

	
	/**
	 * 增加方法
	 */
	@Test
	public void testSave(){
		Xiaoqu x = new Xiaoqu("测试小区");
		xiaoquBizI.save(x);
	}
	
	@Test
	// 查找方法
	public void testGet(){
		Xiaoqu xiaoqu = xiaoquBizI.get(Xiaoqu.class, 50);
		System.out.println(xiaoqu.getName());
	}
	
	@Test
	// 修改方法
	public void testUpdate(){
		Xiaoqu xiaoqu = xiaoquBizI.get(Xiaoqu.class, 50);
		System.out.println(xiaoqu.getName());
		xiaoqu.setName("德光小区");
		xiaoquBizI.update(xiaoqu);
	}
	
	@Test
	// 删除方法
	public void testDelete(){
		Xiaoqu xiaoqu = xiaoquBizI.get(Xiaoqu.class, 50);
		System.out.println(xiaoqu.getName());
		xiaoquBizI.delete(xiaoqu);	
		}
}
