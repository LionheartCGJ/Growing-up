package com.bes.test.propertise.jvm;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;

public class GetProperties {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//取得所有系统属性的key
		Properties prop = System.getProperties();
		Enumeration<?> propertiesName = prop.propertyNames();
		//将所有key存入ArrayList中
		List<String> list = new ArrayList<String>();
		while(propertiesName.hasMoreElements()){
			list.add((String)propertiesName.nextElement());
		}
		//对所有key进行自然排序
		Collections.sort(list);
		//获取当前系统用户名,用户目录,以及java版本
		String userName = System.getenv("USERNAME");
		String userPath = prop.getProperty("user.home");
		String version = prop.getProperty("java.runtime.version");
		//创建文件
		File file = new File(userPath+File.separator+userName+"_"+version+".txt");
		BufferedWriter bufr  =null;
		//获取流
		try {
			bufr = new BufferedWriter(new FileWriter(file));
			//遍历key，取得所有键值对输出并写入文件
			for(String key:list){
				String value = prop.getProperty(key);
				System.out.println(key+"  =  "+value);
				bufr.write( key+" "+"\t"+value);
				bufr.flush();
				bufr.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
				try {
				if (bufr != null)
					bufr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		
		
	}

}
 