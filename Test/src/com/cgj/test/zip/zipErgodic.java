package com.cgj.test.zip;

import java.io.File;
/**
 * ������ѹ������zipĿ¼
 * �Խ�ѹ������txt��Java�����޸�
 * @author linzhipeng
 *
 */

public class zipErgodic {
	
	public static void  zipErgodics(File file) {
		if (file.canRead()) {
			if (file.isDirectory()) {
				File[] files=file.listFiles();
				for (File fileEach : files) {
					if (fileEach.isDirectory()) {
						zipErgodics(fileEach);
					}else {
						int index=fileEach.getName().lastIndexOf(".");
						String type=fileEach.getName().substring(index+1);
						if ("txt".equals(type)) {
							txtInZipReplace.txtRead(fileEach);
							txtInZipReplace.txtWrite(fileEach);
						}else if ("java".equals(type)) {
							javaInZipReplace.javaRead(fileEach);
							javaInZipReplace.javaWrite(fileEach);
						}
					}
					
				}
				
			}else {
				int index=file.getName().lastIndexOf(".");
				String type=file.getName().substring(index+1);
				if ("txt".equals(type)) {
					txtInZipReplace.txtRead(file);
					txtInZipReplace.txtWrite(file);
				}else if ("java".equals(type)) {
					javaInZipReplace.javaRead(file);
					javaInZipReplace.javaWrite(file);
				}
				
			}
			
			
		}else {
			System.out.println(".......");
			System.out.println("�ļ����ɶ�");
		}
		
	}

}
