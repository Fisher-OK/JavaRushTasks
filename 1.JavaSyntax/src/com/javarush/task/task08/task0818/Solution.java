package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> map = new HashMap<>();
        map.put("1", 500);
        map.put("2", 300);
        map.put("3", 200);
        map.put("4", 600);
        map.put("5", 700);
        map.put("6", 800);
        map.put("7", 5100);
        map.put("8", 500);
        map.put("9", 100);
        map.put("10", 1500);

        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        Iterator<HashMap.Entry<String, Integer>> integerIterator = map.entrySet().iterator();
        while (integerIterator.hasNext()) {
            Map.Entry<String, Integer> pair = integerIterator.next();
                if (pair.getValue() < 500)
                    integerIterator.remove();

        }
    }

    public static void main(String[] args) {

    }
}