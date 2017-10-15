package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        char[] ch = s.toCharArray();
        ArrayList<Character> arrayListSog = new ArrayList<>();
        ArrayList<Character> arrayListGl = new ArrayList<>();
        for (char c1 : ch) {
            if (isVowel(c1) && c1 != ' ') {
                arrayListSog.add(c1);
            }
            else if (c1 != ' '){
                arrayListGl.add(c1);
            }
        }

        for (char c2 : arrayListSog) {
            System.out.print(c2 + " ");
        }
        System.out.println();
        for (char c3 : arrayListGl) {
            System.out.print(c3 + " ");
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}