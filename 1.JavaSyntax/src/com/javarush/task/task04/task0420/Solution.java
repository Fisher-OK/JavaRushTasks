package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int a = Integer.parseInt(reader.readLine());
//        int b = Integer.parseInt(reader.readLine());
//        int c = Integer.parseInt(reader.readLine());
//
//        if (a > b && b > c)
//            System.out.println(a + " " + b + " " + c);
//        if (a > b && b < c && a > c )
//            System.out.println(a + " " + c + " " + b);
//        if (a < b && a > c)
//            System.out.println(b + " " + a + " " + c);
//        if (a < b && a < c && b > c)
//            System.out.println(b + " " + c + " " + a);
//        if (c > b && b > a)
//            System.out.println(c + " " + b + " " + a);
//        if (c > a && a > b && c > b)
//            System.out.println(c + " " + a + " " + b);
        int a[] = new int[3];
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    int t = a[j];
                    a[j] = a[i];
                    a[i] = t;
                }
            }
        }


        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);

        }


    }
}
