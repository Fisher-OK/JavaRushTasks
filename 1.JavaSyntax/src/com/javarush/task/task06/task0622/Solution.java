package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[5];
        for (int i = 0; i < 5; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < array.length ; i++) {
            for (int j = array.length-1; j > i; j--) {
                if (array[j-1] > array[j]) {
                    int x = array[j-1];
                    array[j-1] = array[j];
                    array[j] = x;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        //напишите тут ваш код
    }
}
