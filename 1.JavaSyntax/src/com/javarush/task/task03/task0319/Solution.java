package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int num = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        System.out.println(s + " получает " + num + " через " + num2 + " лет.");
    }
}
