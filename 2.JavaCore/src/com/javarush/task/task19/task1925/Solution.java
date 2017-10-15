package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException{
        String file1 = args[0];
        String file2 = args[1];
        String[] s;
        StringBuilder sb = new StringBuilder();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(file1));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file2));



        while (bufferedReader.ready()) {
            s = bufferedReader.readLine().split(" ");
            for (String ss : s) {
//                if (ss.matches("\\W{7,}|\\w{7,}")) {
//                    sb.append(ss + ",");
//
//                }
                if (ss.length() > 6) {
                    sb.append(ss + ",");
                }

            }
//            Matcher m = Pattern.compile("\\b\\w{6,}\\b").matcher(s);

        }
        sb.deleteCharAt(sb.length()-1);
        bufferedWriter.write(sb.toString());
        bufferedReader.close();
        bufferedWriter.close();

    }
}
