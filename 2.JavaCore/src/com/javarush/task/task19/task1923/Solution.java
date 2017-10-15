package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        String file1 = args[0];
        String file2 = args[1];

        BufferedReader bufferedReader = new BufferedReader(new FileReader(file1));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file2));
        ArrayList<String> array = new ArrayList<>();
        String ss = "";

        while (bufferedReader.ready()) {
            String[] s = bufferedReader.readLine().split(" ");
            for (int i = 0; i < s.length; i++) {
                if (s[i].matches(".*[0-9]+.*")) {
                    ss += " " + s[i];
                }
            }

        }
        bufferedWriter.write(ss);
        bufferedReader.close();
        bufferedWriter.close();
    }
}
