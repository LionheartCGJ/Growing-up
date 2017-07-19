package com.cgj.test.propertise.jvm;

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
		//ȡ������ϵͳ���Ե�key
		Properties prop = System.getProperties();
		Enumeration<?> propertiesName = prop.propertyNames();
		//������key����ArrayList��
		List<String> list = new ArrayList<String>();
		while(propertiesName.hasMoreElements()){
			list.add((String)propertiesName.nextElement());
		}
		//������key������Ȼ����
		Collections.sort(list);
		//��ȡ��ǰϵͳ�û���,�û�Ŀ¼,�Լ�java�汾
		String userName = System.getenv("USERNAME");
		String userPath = prop.getProperty("user.home");
		String version = prop.getProperty("java.runtime.version");
		//�����ļ�
		File file = new File(userPath+File.separator+userName+"_"+version+".txt");
		BufferedWriter bufr  =null;
		//��ȡ��
		try {
			bufr = new BufferedWriter(new FileWriter(file));
			//����key��ȡ�����м�ֵ�������д���ļ�
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
 