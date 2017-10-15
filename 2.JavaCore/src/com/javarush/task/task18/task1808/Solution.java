package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        String s3 = reader.readLine();
        FileInputStream file1 = new FileInputStream(s1);
        FileOutputStream file2 = new FileOutputStream(s2);
        FileOutputStream file3 = new FileOutputStream(s3);

        byte[] buffer = new byte[2000];

        while (file1.available() > 0) {
            int count = file1.read(buffer);
            if (count % 2 != 0) {
                file2.write(buffer, 0, ((count/2)+1));
                file3.write(buffer, ((count/2)+1), count/2);
            } else if (count % 2 == 0) {
                file2.write(buffer, 0, count/2);
                file3.write(buffer, count/2, count/2);
            }
        }
        reader.close();
        file1.close();
        file2.close();
        file3.close();
    }
}
