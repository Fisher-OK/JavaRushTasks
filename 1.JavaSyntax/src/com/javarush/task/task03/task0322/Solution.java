package com.javarush.task.task03.task0322;


/* 
Большая и чистая
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1, s2, s3;
        s1 = reader.readLine();
        s2 = reader.readLine();
        s3 = reader.readLine();
        System.out.println(s1 + " + " + s2 + " + " + s3 + " = Чистая любовь, да-да!");
    }
}