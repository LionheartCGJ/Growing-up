package test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;

import java.util.zip.ZipInputStream;
/*
 * 解压zip文件
 */

public class MyzipDecompress {  
    
    public static void zipDecompress(String zipfilepath,File outFile) {
    	File zipfile=new File(zipfilepath);
    	
    	
        try {  
            ZipInputStream Zin=new ZipInputStream(new FileInputStream(zipfilepath));
                    //"F:\\JobExercise\\IOTestThree\\zip.zip"));//输入源zip路径  
            BufferedInputStream Bin=new BufferedInputStream(Zin);  
            String Parent=outFile.getAbsolutePath(); //输出路径（文件夹目录）  
            File Fout=null;  
            ZipEntry entry;  
            try {  
                while((entry = Zin.getNextEntry())!=null && !entry.isDirectory()){  
                    Fout=new File(Parent,entry.getName());  
                    if(!Fout.exists()){  
                        (new File(Fout.getParent())).mkdirs();  
                    }  
                    FileOutputStream out=new FileOutputStream(Fout);  
                    BufferedOutputStream Bout=new BufferedOutputStream(out);  
                    int b;  
                    while((b=Bin.read())!=-1){  
                        Bout.write(b);  
                        Bout.flush();
                    }  
                    Bout.close();  
                    out.close();  
                    System.out.println(Fout+"解压成功");  
                    
                   
                }  
                
                Bin.close();  
                Zin.close();  
            } catch (IOException e) {  
                
                e.printStackTrace();  
            }  
        } catch (FileNotFoundException e) {  
        
            e.printStackTrace();  
        } finally{
        	zipfile.delete(); 
        	System.out.println("原来的zip文件已删除");//删除原先的zip文件
        } 
     
    }
		
	}
        
        
