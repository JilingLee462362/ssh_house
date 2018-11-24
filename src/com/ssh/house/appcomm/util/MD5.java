// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   MD5.java

package com.ssh.house.appcomm.util;

import java.security.MessageDigest;

public class MD5 {

	private MD5() {
	}

	public static byte[] getKeyedDigest(byte buffer[], byte key[])
			throws Exception {
		MessageDigest md5;
		md5 = MessageDigest.getInstance("MD5");
		md5.update(buffer);
		return md5.digest(key);

	}

	public static String getKeyedDigest(String strSrc, String key){
		
		String result = "";
		try {
			MessageDigest md5 = MessageDigest.getInstance("MD5");
			md5.update(strSrc.getBytes("UTF8"));
			byte temp[] = md5.digest(key.getBytes("UTF8"));
			for (int i = 0; i < temp.length; i++)
				result = (new StringBuilder(String.valueOf(result))).append(
						Integer.toHexString(0xff & temp[i] | 0xffffff00).substring(
								6)).toString();
		} catch (Exception e) {
			// TODO: handle exception
		}
		

		return result;
	}

	public static void main(String args[]) {
		String s = "admin";
			String mi = getKeyedDigest(s, "zxowl@qq.com");
			System.out.println(mi);
			//21232f297a57a5a743894a0e4a801fc3
			//868e55e36d421814a00de2defa578950

			//System.out.println((new StringBuilder("mi:")).append(mi).toString());

	}
}
