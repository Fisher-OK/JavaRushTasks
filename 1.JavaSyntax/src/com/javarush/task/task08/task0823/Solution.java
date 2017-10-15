package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        char[] chars = s.toCharArray();
        if (chars[0] != ' ')
            chars[0] = Character.toUpperCase(chars[0]);
        for (int i = 1; i < chars.length-1; i++) {
            if (chars[i-1] == ' ' && chars[i] != ' ')
                chars[i] = Character.toUpperCase(chars[i]);

        }

        String ss = new String(chars);
        System.out.println(ss);

        //напишите тут ваш код
    }
}
