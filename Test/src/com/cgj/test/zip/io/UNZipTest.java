package com.cgj.test.zip.io;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class UNZipTest {
	public static void unZip(File zipFile,File aimFile) {
		// ������
		FileInputStream fis = null;
		ZipInputStream zins = null;
		BufferedOutputStream buos = null;

		try {
			// ��ȡZipInputStream������
			fis = new FileInputStream(zipFile);
			zins = new ZipInputStream(fis);
			// �����ļ����
			ZipEntry entry = null;
			// ѭ����ȡÿ���ļ������
			while ((entry = zins.getNextEntry()) != null
					&& !entry.isDirectory()) {
				// �����ļ�
				File fout = new File(aimFile.getAbsoluteFile(), entry.getName());
				if (!fout.exists()) {
					(new File(fout.getParent())).mkdirs();
				}
				// ��ȡ�����������
				buos = new BufferedOutputStream(new FileOutputStream(fout));
				// ����ÿ�ζ�ȡ�ĳ���
				byte[] byteSize = new byte[1024];
				// ѭ����ȡ�����ļ�
				int count = 0;
				while ((count = zins.read(byteSize)) > 0) {
					buos.write(byteSize, 0, count);
					buos.flush();
				}
				buos.close();

			}
			System.out.println(zipFile.getName() + "��ѹ��ɣ�");
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
			System.out.println("ԭ����zip�ļ���ɾ��");// ɾ��ԭ�ȵ�zip�ļ�
	}

}
