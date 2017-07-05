package com.cgj.test.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class WriteToFile {
    private String temp = "asadasdasfdsdgdskfnafrweoijmnvslafjx vljfaspdofsadiufaspefpasdfsdfjsl;";
    private int count = 1000;
    private File file = null;
    private PrintWriter printWriter = null;

    public void write() {
        Long startTime2 = System.currentTimeMillis();
        try {
            for (int i = 0; i < count; i++) {
                file = new File("F:\\", "temp2.txt");
                printWriter = new PrintWriter(new OutputStreamWriter(new FileOutputStream(file, true)), true);
                printWriter.println(temp);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Long endTime2 = System.currentTimeMillis();
        System.out.println("" + count + "行：用时" + (endTime2 - startTime2));

        Long startTime = System.currentTimeMillis();
        file = new File("F:\\", "temp1.txt");
        try {
            printWriter = new PrintWriter(new OutputStreamWriter(new FileOutputStream(file, true)), true);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < count; i++) {
            printWriter.println(temp);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("" + count + "行：用时" + (endTime - startTime));
    }
}
