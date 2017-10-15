package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();

        FileInputStream file1 = new FileInputStream(fileName1);
        FileOutputStream file2 = new FileOutputStream(fileName2);

        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> arrayList = new ArrayList<>();
        String result = "";

        while (file1.available() > 0) {
            sb.append((char) file1.read());
        }

        for (String s : sb.toString().split(" ")) {
            arrayList.add((int) Math.round(Double.parseDouble(s)));
        }

        for (int i = 0; i < arrayList.size(); i++) {
            result = result + arrayList.get(i).toString() + " ";
            //file2.write(arrayList.get(i).toString() + " ");
        }

        file2.write(result.getBytes());

        reader.close();
        file1.close();
        file2.close();
    }
}
