package com.cgj.test.socket.nio;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;



public class Client{
    public static void main(String[] args){
        Socket s = null;
		try {
			s = new Socket("127.0.0.1",8888);
        
        InputStream  inStram=s.getInputStream();
        OutputStream outStream=s.getOutputStream();
        
        // ���
        PrintWriter out=new PrintWriter(outStream,true);
        
        out.print("getPublicKey��ã�");
        out.flush();

        s.shutdownOutput();// �������
        
        // ����
        @SuppressWarnings("resource")
        Scanner in=new Scanner(inStram);
        StringBuilder sb=new StringBuilder();
        while(in.hasNextLine()){
            String line=in.nextLine();
            sb.append(line);
        }
        String response=sb.toString();
        System.out.println("response="+response);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}