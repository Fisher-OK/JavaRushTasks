package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream(args[0]);
        int countSim = 0;
        int countProb = 0;

        while (file.available() > 0) {
            int tmp = file.read();
            countSim++;
            if (Character.isSpaceChar(tmp)) {
                countProb++;
            }
        }

        float res = (float)(((float) countProb / (float) countSim) * 100);
        System.out.println(String.format("%.2f", res));

        file.close();
    }
}
