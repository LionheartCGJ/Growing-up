package com.cgj.test.iotest.zip;

import java.io.File;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File file = new File("D:\\Document\\Test\\Test.zip");
		File aimFile = new File("D:\\Document\\Test\\temp");
		UNZipTest.unZip(file,aimFile);
		ZipTest.zip(file, aimFile);
		
	}

}
