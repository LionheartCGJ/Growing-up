package com.cgj.test.zip.io;

import java.io.File;
import java.io.IOException;
/**
 * zip�ļ�ѹ��
 */
import java.io.*;
import java.util.zip.*;

public class ZipTest {

	public ZipTest() {
	}

	public static void zip(File outZipFile, File inputFile) {
		// ��ȡĿ���ļ����µ������ļ�
		File[] files = inputFile.listFiles();
		// �������������
		FileOutputStream fos = null;
		FileInputStream fis = null;
		BufferedOutputStream buos = null;
		try {
			System.out.println("ѹ����...");
			// ��ȡZipOutputStream�����
			fos = new FileOutputStream(outZipFile);
			ZipOutputStream zos = new ZipOutputStream(fos);
			buos = new BufferedOutputStream(zos);
			// ���������ļ�
			for (File file : files) {
				// ����ѹ�����
				zos.putNextEntry(new ZipEntry(file.getName()));
				System.out.println(file.getName());
				// ��ȡ������
				fis = new FileInputStream(file);
				// ѭ����ȡ�ļ�
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
		// ɾ����ѹ���ļ���
		for (File file : files) {
			if(file.delete())
			System.out.println(file.getName());
		}

		if (inputFile.delete()) {
			System.out.println("�ļ���ɾ����ɣ�");
		}
		System.out.println("ѹ�����");
	}

}
