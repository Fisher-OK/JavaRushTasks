package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num;
        num = Integer.parseInt(reader.readLine());
        if (num > 0)
            System.out.println(num*2);
        if (num < 0)
            System.out.println(num+1);
        if (num == 0)
            System.out.println(num);

    }

}