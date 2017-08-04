package com.shiyanlou.reverse.list;

import java.util.Arrays;
import java.util.Iterator;

public class Test {

    public static void main(String[] args) {
        FileOperate fo = new FileOperate();
        String fileString = fo.readFile("D:\\words.txt");
        ReverseList<String> list = new ReverseList<>(Arrays.asList(fileString.split(" ")));
        Iterator<String> iterator = list.reversed().iterator();
        StringBuilder sb = new StringBuilder();
        if (iterator.hasNext()) {
            sb.append(iterator.next());
        }
        while (iterator.hasNext()) {
            sb.append(" " + iterator.next());
        }
        fo.outFile("D:\\words2.txt", sb.toString());
    }

}
