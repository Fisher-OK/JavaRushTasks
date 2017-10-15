package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int count = 0;
        int count2 = 0;
        int[] mas = new int[3];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < mas.length; i++) {
            mas[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > 0)
                count++;
            else if (mas[i] < 0)
                count2++;
        }

        System.out.println("количество отрицательных чисел: "+count2);
        System.out.println("количество положительных чисел: "+count);

    }
}
