package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();
        map.put("1", "Vasya");
        map.put("2", "Vasya");
        map.put("3", "Petya");
        map.put("4", "Vasya");
        map.put("5", "Dima");
        map.put("6", "Vasya");
        map.put("7", "Vasya");
        map.put("8", "Vasya");
        map.put("9", "Vasya");
        map.put("10", "Vasya");

        return map;

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        //напишите тут ваш код
        HashMap<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            //String s = pair.getValue();
            int i = 0;
            for (Map.Entry<String, String> pair2 : copy.entrySet()) {
                if (pair2.getValue().equals(pair.getValue())) {
                    i++;
                    if (i > 1)
                    removeItemFromMapByValue(map, pair.getValue());
                }
            }
        }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
