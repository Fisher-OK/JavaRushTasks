package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }


        // напишите тут ваш код
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        int count = 0;
        for (int i = 0; i < alphabet.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                char[] chars = list.get(j).toCharArray();
                for (int k = 0; k < chars.length; k++) {
                    if (alphabet.get(i) == chars[k])
                    count++;
                }
            }
            map.put(alphabet.get(i), count);
            count = 0;
        }

        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

}
