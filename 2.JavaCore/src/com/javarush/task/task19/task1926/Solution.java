package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        StringBuilder sb = new StringBuilder();

        bufferedReader.close();

        bufferedReader = new BufferedReader(new FileReader(fileName));

        while (bufferedReader.ready()) {
            sb.append(bufferedReader.readLine());
            sb.reverse();
            System.out.println(sb.toString());
            sb.setLength(0);

        }
        bufferedReader.close();
    }
}
