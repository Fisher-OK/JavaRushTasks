package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import javax.swing.plaf.basic.BasicButtonUI;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file;
        byte[] buffer = new byte[2000];

        while (true) {
            file = new FileInputStream(reader.readLine());
            int count = file.read(buffer);
            if (count >= 1000) {
                continue;
            } else
            {
                reader.close();
                file.close();
                throw new DownloadException();

            }
        }

    }

    public static class DownloadException extends Exception {

    }
}
