package test;

import java.io.File;
/**
 * zip文件压缩
 */
import java.io.*;
import java.util.zip.*;

public class MyZipCompressing {

	public MyZipCompressing() {
	}

	public void zipCompress(String zipFileName, File inputFile)
			throws Exception {
		ZipOutputStream out = null;
		BufferedOutputStream bo = null;
		try {
			System.out.println("压缩中...");
			out = new ZipOutputStream(new FileOutputStream(zipFileName));
			bo = new BufferedOutputStream(out);
			zip(out, inputFile, inputFile.getName(), bo);

			// out.close(); // 输出流关闭
			System.out.println("压缩完成");
			// inputFile.delete();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			bo.close();
			out.close();
		}
	}

	private void zip(ZipOutputStream out, File f, String base,
			BufferedOutputStream bo) throws Exception {// 方法重载
		BufferedInputStream bi=null;
		
		try {
			if (f.isDirectory()) {
				File[] fl = f.listFiles();
				if (fl.length == 0) {
					out.putNextEntry(new ZipEntry(base + "/")); // 创建zip压缩进入点base
					System.out.println(base + "/");
				}
				for (int i = 0; i < fl.length; i++) {
					zip(out, fl[i], base + "/" + fl[i].getName(), bo); // 递归遍历子文件夹
				}

			} else {
				out.putNextEntry(new ZipEntry(base)); // 创建zip压缩进入点base
				System.out.println(base);
				FileInputStream in = new FileInputStream(f);
				 bi = new BufferedInputStream(in);
				int b;
				while ((b = bi.read()) != -1) {
					bo.write(b); // 将字节流写入当前zip目录
					bo.flush();
				}
				bi.close();
				in.close(); // 输入流关闭
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
