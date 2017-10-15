package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String readerFile = bufferedReader.readLine();
        String writeFile = bufferedReader.readLine();

        FileReader fileReader = new FileReader(readerFile);
        FileWriter fileWriter = new FileWriter(writeFile);

        ArrayList<Integer> array = new ArrayList<>();

        while (fileReader.ready()) {
            array.add(fileReader.read());
        }

        for (int i = 1; i < array.size(); i = i + 2) {
            fileWriter.write(array.get(i));
        }

        bufferedReader.close();
        fileReader.close();
        fileWriter.close();

    }
}
