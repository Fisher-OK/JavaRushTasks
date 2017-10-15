package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();
        FileOutputStream file1 = new FileOutputStream(fileName1);
        FileInputStream file2 = new FileInputStream(fileName2);
        FileInputStream file3 = new FileInputStream(fileName3);


        while (file2.available() > 0) {
            file1.write(file2.read());
        }
        while (file3.available() > 0) {
            file1.write(file3.read());
        }
        reader.close();
        file1.close();
        file2.close();
        file3.close();

    }
}
