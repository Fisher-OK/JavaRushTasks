package com.javarush.task.task08.task0816;

import com.sun.org.apache.regexp.internal.RE;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Stallone1", new Date("JUNE 1 1980"));
        map.put("Stallone2", new Date("JUNE 1 1980"));
        map.put("Stallone3", new Date("JUNE 1 1980"));
        map.put("Stallone4", new Date("JUNE 1 1980"));
        map.put("Stallone5", new Date("JUNE 1 1980"));
        map.put("Stallone6", new Date("JUNE 1 1980"));
        map.put("Stallone7", new Date("JUNE 1 1980"));
        map.put("Stallone8", new Date("JUNE 1 1980"));
        map.put("Stallone9", new Date("JUNE 1 1980"));

        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код
        ArrayList<String> arrayList = new ArrayList<>();
        for (Map.Entry<String, Date> pair : map.entrySet()) {
            if (pair.getValue().getMonth() == 5 || pair.getValue().getMonth() == 6 || pair.getValue().getMonth() ==7) {
                arrayList.add(pair.getKey());
            }
        }

        for (String s : arrayList) {
            map.remove(s);
        }

    }

    public static void main(String[] args) {

    }
}
