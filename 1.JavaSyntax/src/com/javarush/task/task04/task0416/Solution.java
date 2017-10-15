package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double num = Double.parseDouble(reader.readLine());
//        if ((num <= 0) && (num < 3))
//            System.out.println("зелёный");
//        if ((num >=3) && (num < 4))
//            System.out.println("желтый");
//        if ((num >=4) && (num < 5))
//            System.out.println("красный");
        if (((num%5) >= 0) && ((num%5) < 3))
            System.out.println("зелёный");
        if (((num%5) >= 3) && ((num%5) < 4))
            System.out.println("желтый");
        if ((num%5) >= 4)
            System.out.println("красный");
    }
}