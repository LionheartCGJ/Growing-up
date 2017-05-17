package shiyanlou.reverse.list;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class FileOperate {
    public String readFile(String pathName) {
        StringBuilder stringBuilder = new StringBuilder();
        BufferedReader reader = null;
        File file = new File(pathName);
        try {
            reader = new BufferedReader(new FileReader(file));
            String line = null;
            if ((line = reader.readLine()) != null) {
                stringBuilder.append(line);
            }
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(" " + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return stringBuilder.toString();
    }

    public void outFile(String pathName, String result) {
        BufferedWriter write = null;
        File file = new File(pathName);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            write = new BufferedWriter(new FileWriter(file));
            write.write(result);
            write.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (write != null) {
                    write.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
