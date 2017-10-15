package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("1", "Kolya1");
        map.put("2", "Kolya2");
        map.put("3", "Kolya3");
        map.put("4", "Kolya4");
        map.put("5", "Kolya5");
        map.put("6", "Kolya6");
        map.put("7", "Kolya1");
        map.put("5", "Kolya8");
        map.put("9", "Kolya9");
        map.put("10", "Kolya1");

        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
