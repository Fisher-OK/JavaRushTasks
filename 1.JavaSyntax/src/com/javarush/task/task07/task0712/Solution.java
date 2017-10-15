package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int shortString, longString, shortIndex = 0, longIndex = 0;

        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }

        shortString = list.get(0).length();
        longString = list.get(0).length();

        for (int i = 0; i < list.size(); i++) {
            if (shortString > list.get(i).length()) {
                shortString = list.get(i).length();
                shortIndex = i;

            }
            if (longString < list.get(i).length()) {
                longString = list.get(i).length();
                longIndex = i;
            }
        }

        if (shortIndex < longIndex)
            System.out.println(list.get(shortIndex));
        else
            System.out.println(list.get(longIndex));


    }
}
