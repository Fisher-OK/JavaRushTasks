package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("1111.txt"));

        String s = null;
        while (true) {
            s = reader.readLine();
            if (s.equals("exit")) {
                bufferedWriter.write(s);
                break;
            }
            bufferedWriter.write(s);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
        reader.close();
    }
}
