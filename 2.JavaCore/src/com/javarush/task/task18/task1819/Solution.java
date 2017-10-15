package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename1 = reader.readLine();
        String filename2 = reader.readLine();

        FileInputStream file1 = new FileInputStream(filename1);

        byte[] buffer = new byte[file1.available()];

        int count = 0;

        while (file1.available() > 0) {
            file1.read(buffer);
        }

        FileInputStream file2 = new FileInputStream(filename2);
        FileOutputStream file3 = new FileOutputStream(filename1);
        byte[] buffer2 = new byte[file2.available()];

        while (file2.available() > 0) {
            count = file2.read(buffer2);
            file3.write(buffer2);
        }

        file3.write(buffer);

        reader.close();
        file1.close();
        file2.close();
        file3.close();

    }
}
