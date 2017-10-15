package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }

        int max = list.get(0).length();

        for (int i = 1; i < list.size(); i++) {
                if (max < list.get(i).length())
                    max = list.get(i).length();
        }

//        for (int i = 0; i < list.size(); i++) {
////            list2.add(s);
//            if (s.equals(list.get(i)))
//                list2.add(list.get(i));
//        }

        for (int i = 0; i < list.size(); i++) {
            if (max == list.get(i).length())
            System.out.println(list.get(i));
        }
    }
}
