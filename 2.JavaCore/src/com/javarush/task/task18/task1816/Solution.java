package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream(args[0]);
        int count = 0;

        while (file.available() > 0) {
            int sim = file.read();
            if ((sim >= 65 && sim <= 90) || (sim >= 97 && sim <= 122)) count++;
        }

        System.out.println(count);
        file.close();
    }
}
