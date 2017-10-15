package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileRead = bufferedReader.readLine();
        String fileWrite = bufferedReader.readLine();

        BufferedReader fileReader = new BufferedReader(new FileReader(fileRead));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileWrite));

        String s = "";

        while (fileReader.ready()) {
            s += (char) fileReader.read();
        }
//        String[] array = s.trim().split(" ");
//        if (array.matches("")) {
//
//        }

//        String[] array = s.split(" ");
//        for (String s1 : array) {
//            if (s1.matches("\\b[0-9]+\\b"))
//            fileWriter.write(s1 + " ");
//        }

        Pattern p = Pattern.compile("\\b[0-9]+\\b");
        Matcher m = p.matcher(s);

        while (m.find()) {
            fileWriter.write(m.group());
            fileWriter.write(32);
        }

        bufferedReader.close();
        fileReader.close();
        fileWriter.close();
    }
}
