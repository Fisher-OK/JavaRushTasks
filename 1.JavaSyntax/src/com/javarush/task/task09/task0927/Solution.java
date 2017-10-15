package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        HashMap<String, Cat> hashMap = new HashMap<>();
        hashMap.put("Murzik1", new Cat("M1"));
        hashMap.put("Murzik2", new Cat("M2"));
        hashMap.put("Murzik3", new Cat("M3"));
        hashMap.put("Murzik4", new Cat("M4"));
        hashMap.put("Murzik5", new Cat("M5"));
        hashMap.put("Murzik6", new Cat("M6"));
        hashMap.put("Murzik7", new Cat("M7"));
        hashMap.put("Murzik8", new Cat("M8"));
        hashMap.put("Murzik9", new Cat("M9"));
        hashMap.put("Murzik10", new Cat("M10"));
        return hashMap;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        Set<Cat> set = new HashSet<>();
        for (Map.Entry<String, Cat> pair : map.entrySet()) {
            set.add(pair.getValue());
        }
        return set;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
