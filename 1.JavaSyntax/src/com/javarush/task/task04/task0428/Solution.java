package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        int[] mas = new int[3];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > 0)
                count++;
        }

        System.out.println(count);

    }
}
