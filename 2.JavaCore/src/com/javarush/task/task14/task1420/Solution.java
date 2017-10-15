package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bufferedReader.readLine());
        int num2 = Integer.parseInt(bufferedReader.readLine());

            if (num <= 0 || num2 <= 0)
                throw new NumberFormatException("Числа должны быть положительными");

        int[] mas = new int[num];
        int[] mas2 = new int[num2];

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                    mas[i-1] = i;
            } else continue;
        }

        for (int i = 1; i <= num2; i++) {
            if (num2 % i == 0) {
                    mas2[i-1] = i;
            } else continue;
        }

        int nod = 1;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas2.length; j++) {
                if (mas[i] == mas2[j] && mas[i] > nod)
                    nod = mas[i];
            }
        }

        System.out.println(nod);



    }
}
