package com.bes.test.iotest.zip;

import java.io.File;
import java.io.IOException;
/**
 * zip文件压缩
 */
import java.io.*;
import java.util.zip.*;

public class ZipTest {

	public ZipTest() {
	}

	public static void zip(File outZipFile, File inputFile) {
		// 获取目标文件夹下的所有文件
		File[] files = inputFile.listFiles();
		// 定义输入输出流
		FileOutputStream fos = null;
		FileInputStream fis = null;
		BufferedOutputStream buos = null;
		try {
			System.out.println("压缩中...");
			// 获取ZipOutputStream输出流
			fos = new FileOutputStream(outZipFile);
			ZipOutputStream zos = new ZipOutputStream(fos);
			buos = new BufferedOutputStream(zos);
			// 遍历所有文件
			for (File file : files) {
				// 创建压缩入口
				zos.putNextEntry(new ZipEntry(file.getName()));
				System.out.println(file.getName());
				// 获取输入流
				fis = new FileInputStream(file);
				// 循环读取文件
				int temp = 0;
				while ((temp = fis.read())!=-1) {
					buos.write(temp);
					buos.flush();
				}
				fis.close();
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (buos != null) {
					buos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if (fis != null) {
					fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		// 删除被压缩文件夹
		for (File file : files) {
			if(file.delete())
			System.out.println(file.getName());
		}

		if (inputFile.delete()) {
			System.out.println("文件夹删除完成！");
		}
		System.out.println("压缩完成");
	}

}
