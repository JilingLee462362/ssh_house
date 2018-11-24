package com.ssh.house.biz;

import org.junit.Test;

import com.ssh.house.appcomm.SpringUtils;
import com.ssh.house.entity.Xiaoqu;
/**
 * �����࣬����XiaoquBiz
 * @author Administrator
 *
 */
public class TestXiaoquBizImpl {

	XiaoquBizI xiaoquBizI = SpringUtils.getBean("xiaoquBizI", XiaoquBizI.class);
	

	
	/**
	 * ���ӷ���
	 */
	@Test
	public void testSave(){
		Xiaoqu x = new Xiaoqu("����С��");
		xiaoquBizI.save(x);
	}
	
	@Test
	// ���ҷ���
	public void testGet(){
		Xiaoqu xiaoqu = xiaoquBizI.get(Xiaoqu.class, 50);
		System.out.println(xiaoqu.getName());
	}
	
	@Test
	// �޸ķ���
	public void testUpdate(){
		Xiaoqu xiaoqu = xiaoquBizI.get(Xiaoqu.class, 50);
		System.out.println(xiaoqu.getName());
		xiaoqu.setName("�¹�С��");
		xiaoquBizI.update(xiaoqu);
	}
	
	@Test
	// ɾ������
	public void testDelete(){
		Xiaoqu xiaoqu = xiaoquBizI.get(Xiaoqu.class, 50);
		System.out.println(xiaoqu.getName());
		xiaoquBizI.delete(xiaoqu);	
		}
}
