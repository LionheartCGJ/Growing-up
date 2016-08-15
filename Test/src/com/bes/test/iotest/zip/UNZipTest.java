package com.bes.test.iotest.zip;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class UNZipTest {
	public static void unZip(File zipFile,File aimFile) {
		// 定义流
		FileInputStream fis = null;
		ZipInputStream zins = null;
		BufferedOutputStream buos = null;

		try {
			// 获取ZipInputStream流对象
			fis = new FileInputStream(zipFile);
			zins = new ZipInputStream(fis);
			// 定义文件入口
			ZipEntry entry = null;
			// 循环读取每个文件的入口
			while ((entry = zins.getNextEntry()) != null
					&& !entry.isDirectory()) {
				// 创建文件
				File fout = new File(aimFile.getAbsoluteFile(), entry.getName());
				if (!fout.exists()) {
					(new File(fout.getParent())).mkdirs();
				}
				// 获取输出流缓冲区
				buos = new BufferedOutputStream(new FileOutputStream(fout));
				// 定义每次读取的长度
				byte[] byteSize = new byte[1024];
				// 循环读取完整文件
				int count = 0;
				while ((count = zins.read(byteSize)) > 0) {
					buos.write(byteSize, 0, count);
					buos.flush();
				}
				buos.close();

			}
			System.out.println(zipFile.getName() + "解压完成！");
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			try {
				if (zins != null)
					zins.closeEntry();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if (buos != null)
					buos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

		if (zipFile.delete())
			System.out.println("原来的zip文件已删除");// 删除原先的zip文件
	}

}
