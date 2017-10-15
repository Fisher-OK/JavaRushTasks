package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double num = 0;
        double sum = 0;
        int count = 0;
//        for (;i != -1 ; ) {
//            i = Integer.parseInt(reader.readLine());
//            sum = sum + i;
//            count++;
//        }
//        num = Double.parseDouble(reader.readLine());
        while (num != -1)
        {
            num = Double.parseDouble(reader.readLine());
            sum = sum + num;
            count++;
        }
        System.out.println((sum+1)/(count-1));
    }
}

