package com.cgj.test.zip;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
/**
 * ��zip���txt�ļ������޸�
 * @author linzhipeng
 *
 */

public class txtInZipReplace {

	static ArrayList<String> list = new ArrayList<String>();

	public static void txtRead(File file) {
		BufferedReader bf = null;

		try {
			bf = new BufferedReader(new FileReader(file));

			String txt = null;
			while ((txt = bf.readLine()) != null) {
				if (txt.contains("hello!")) {
					txt.replace("hello!", "hello,world!");
					list.add(txt.replace("hello!", "hello,world!"));

				} else {
					list.add(txt);
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// bw.close();
				bf.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}

	}

	public static void txtWrite(File file) {
		BufferedWriter bf = null;
		try {
			bf = new BufferedWriter(new FileWriter(file));
			for (String listsString : list) {
				bf.write(listsString);
				bf.newLine();
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bf.flush();
			} catch (IOException e) {

				e.printStackTrace();
			}
			try {
				bf.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}

	}

}
