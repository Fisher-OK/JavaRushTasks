package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        String s = "";
        while (!s.equals("-1"))
        {
            s = reader.readLine();
            sum = sum + Integer.parseInt(s);
        }
        System.out.println(sum);
    }
}
