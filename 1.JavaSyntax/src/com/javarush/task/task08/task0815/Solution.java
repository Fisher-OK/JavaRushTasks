package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("1", "Dima");
        hashMap.put("2", "Dima1");
        hashMap.put("3", "Dima");
        hashMap.put("4", "Dima2");
        hashMap.put("5", "Dima");
        hashMap.put("6", "Dima3");
        hashMap.put("7", "Dima");
        hashMap.put("8", "Dima5");
        hashMap.put("9", "Dima6");
        hashMap.put("10", "Dima7");

        return hashMap;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int count = 0;

        for (String s : map.values()) {
            if (name.equals(s))
                count++;
        }
        return count;

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        int count = 0;

        for (String s : map.keySet()) {
            if (lastName.equals(s))
                count++;
        }
        return count;

    }

    public static void main(String[] args) {

    }
}
