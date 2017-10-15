package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static int min(int a, int b) {
        if (a < b)
            return b;
        else if (a > b)
            return a;
        else
            return a;
    }

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());

        if (min(a, b) < min(c, d))
            System.out.println(min(c, d));
        else if (min(a, b) == min(c, d))
            System.out.println(min(a, b));
        else
            System.out.println(min(a, b));

    }


}
