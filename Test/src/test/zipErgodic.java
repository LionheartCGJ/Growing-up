package test;

import java.io.File;
/**
 * 遍历解压出来的zip目录
 * 对解压出来的txt和Java进行修改
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
			System.out.println("文件不可读");
		}
		
	}

}
