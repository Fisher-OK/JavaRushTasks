package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileR = bufferedReader.readLine();
        String fileW = bufferedReader.readLine();

        BufferedReader fileReader = new BufferedReader(new FileReader(fileR));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileW));

        String s = "";

        while (fileReader.ready()) {
            s += (char)fileReader.read();
        }

        fileWriter.write(s.trim().replaceAll("\\p{Punct}", ""));

        bufferedReader.close();
        fileReader.close();
        fileWriter.close();
    }
}
