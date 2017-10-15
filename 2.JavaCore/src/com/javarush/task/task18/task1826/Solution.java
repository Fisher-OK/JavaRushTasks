package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) {
        String fileName = args[1];
        String fileOutputName = args[2];

        try {
            if (args[0].equals("-e")) {
               encode(new FileInputStream(fileName), new FileOutputStream(fileOutputName));
            } else if (args[0].equals("-d")) {
                decode(new FileInputStream(fileName), new FileOutputStream(fileOutputName));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void encode(FileInputStream fileRead, FileOutputStream fileWrite) throws IOException{
        byte[] buffer = new byte[fileRead.available()];
        fileRead.read(buffer);
        for (int i = 0; i < buffer.length; i++) {
            buffer[i]--;
        }
        fileWrite.write(buffer);
        fileRead.close();
        fileWrite.close();
    }

    public static void decode(FileInputStream fileRead, FileOutputStream fileWrite) throws IOException{
        byte[] buffer = new byte[fileRead.available()];
        fileRead.read(buffer);
        for (int i = 0; i < buffer.length; i++) {
            buffer[i]++;
        }
        fileWrite.write(buffer);
        fileRead.close();
        fileWrite.close();
    }

}
