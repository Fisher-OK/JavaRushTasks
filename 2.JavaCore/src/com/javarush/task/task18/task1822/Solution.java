package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
//        FileInputStream file = new FileInputStream(args[0]);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader file = new FileReader(reader.readLine());
        BufferedReader reader1 = new BufferedReader(file);
        String line;

        while ((line = reader1.readLine()) != null) {

            for (String s : line.split(" ")) {
                if (s.equals(args[0])) {
                    System.out.println(line);
                }
            }
        }

        reader.close();
        reader1.close();
        file.close();

    }
}
