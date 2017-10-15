package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;

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

        fileWriter.write(s.replaceAll("\\.", "\\!"));

//        s = s.replaceAll("\\.", "\\!");
        bufferedReader.close();
        fileReader.close();
        fileWriter.close();
    }
}
