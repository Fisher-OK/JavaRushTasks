package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();

        FileInputStream file1 = new FileInputStream(s1);
        FileOutputStream file2 = new FileOutputStream(s2);

        byte[] buffer = new byte[1000];
        int count = 0;

        while (file1.available() > 0) {
            count = file1.read(buffer);
        }

//        for (int i = 0; buffer.length/2 > i; i++) {
//            byte tmp = buffer[i];
//            buffer[i] = buffer[buffer.length - i - 1];
//            buffer[buffer.length - i - 1] = tmp;
//        }

        for (int i = count-1; i >= 0 ; i--) {
            file2.write(buffer[i]);
        }

        reader.close();
        file1.close();
        file2.close();

    }
}
