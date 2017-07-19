package com.cgj.test.zip;

import java.io.File;
/**
 * zip�ļ�ѹ��
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
			System.out.println("ѹ����...");
			out = new ZipOutputStream(new FileOutputStream(zipFileName));
			bo = new BufferedOutputStream(out);
			zip(out, inputFile, inputFile.getName(), bo);

			// out.close(); // ������ر�
			System.out.println("ѹ�����");
			// inputFile.delete();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			bo.close();
			out.close();
		}
	}

	private void zip(ZipOutputStream out, File f, String base,
			BufferedOutputStream bo) throws Exception {// ��������
		BufferedInputStream bi=null;
		
		try {
			if (f.isDirectory()) {
				File[] fl = f.listFiles();
				if (fl.length == 0) {
					out.putNextEntry(new ZipEntry(base + "/")); // ����zipѹ�������base
					System.out.println(base + "/");
				}
				for (int i = 0; i < fl.length; i++) {
					zip(out, fl[i], base + "/" + fl[i].getName(), bo); // �ݹ�������ļ���
				}

			} else {
				out.putNextEntry(new ZipEntry(base)); // ����zipѹ�������base
				System.out.println(base);
				FileInputStream in = new FileInputStream(f);
				 bi = new BufferedInputStream(in);
				int b;
				while ((b = bi.read()) != -1) {
					bo.write(b); // ���ֽ���д�뵱ǰzipĿ¼
					bo.flush();
				}
				bi.close();
				in.close(); // �������ر�
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
