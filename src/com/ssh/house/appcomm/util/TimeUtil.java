package com.ssh.house.appcomm.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TimeUtil {
	public static String gettimes(){
		SimpleDateFormat sdf  =   new  SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
  		Calendar  calCurrent = Calendar.getInstance();
  		Date date = calCurrent.getTime();
  		String ltime =  sdf.format(date); 
		return ltime;
	}
	public static String getYearMD(){
		SimpleDateFormat sdf  =   new  SimpleDateFormat("yyyy-MM-dd E"); 
  		Calendar  calCurrent = Calendar.getInstance();
  		Date date = calCurrent.getTime();
  		String ltime =  sdf.format(date); 
		return ltime;
	}
	public static String gettimesString(){
		SimpleDateFormat sdf  =   new  SimpleDateFormat("yyyyMMddHHmmss"); 
  		Calendar  calCurrent = Calendar.getInstance();
  		Date date = calCurrent.getTime();
  		String ltime =  sdf.format(date); 
		return ltime;
	}
	public static String getWeekbyTimes(String str){
		Calendar c=Calendar.getInstance();
		SimpleDateFormat sdf  =   new  SimpleDateFormat("yyyy-MM-dd"); 
		Date date = null;
		try {
			date = sdf.parse(str);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		c.setTime(date); 
		int ltime = c.get(Calendar.DAY_OF_WEEK);
		return ltime+"";
	}
	public static String getFristDayInWeekbyTimes(String str){
		Calendar c=Calendar.getInstance();
		SimpleDateFormat sdf  =   new  SimpleDateFormat("yyyy-MM-dd"); 
		Date date = null;
		try {
			date = sdf.parse(str);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		c.setTime(date); 
		c.setFirstDayOfWeek(Calendar.MONDAY); 
		c.set(Calendar.DAY_OF_WEEK,c.getFirstDayOfWeek());
		Date d = c.getTime();
		String ltime =  sdf.format(d); 
		return ltime;
	}
	public static String dateDiff(String startTime, String endTime, String format,String type) {
	//���մ���ĸ�ʽ����һ��simpledateformate����
	SimpleDateFormat sd = new SimpleDateFormat(format);
	long nd = 1000*24*60*60;//һ��ĺ�����
	long nh = 1000*60*60;//һСʱ�ĺ�����
	long nm = 1000*60;//һ���ӵĺ�����
	long ns = 1000;//һ���ӵĺ�����
	long diff;
	long day = 0;
	try {
		//�������ʱ��ĺ���ʱ�����
		diff = sd.parse(endTime).getTime() - sd.parse(startTime).getTime();
		if (type.equals("1")) {
			day = diff/nd;//����������
		}else if(type.equals("2")){
			day = diff%nd/nh;//��������Сʱ
		}else if(type.equals("3")){
			day = diff%nd%nh/nm;//�������ٷ���
		}else if(type.equals("4")){
			day = diff%nd%nh%nm/ns;//����������
		}
		
		//������
	} catch (ParseException e) {
		 e.printStackTrace();
	}
	return day+"";

}

	public static void main(String[] arg){
		System.out.println(getWeekbyTimes("2012-04-11"));
		System.out.println(getFristDayInWeekbyTimes("2012-04-11"));
		
	}
}
