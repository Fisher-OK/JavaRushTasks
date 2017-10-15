package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String file = bufferedReader.readLine();

        FileReader fileReader = new FileReader(file);
        String[] arrayString;
        String s = "";
        int count = 0;

        while (fileReader.ready()) {
            char ch = (char)fileReader.read();
            s += ch;
        }

        arrayString = s.split("\\W");
        for (String s1 : arrayString) {
            if ("world".equals(s1))
                count++;
        }

        bufferedReader.close();
        fileReader.close();
        System.out.println(count);
    }
}
