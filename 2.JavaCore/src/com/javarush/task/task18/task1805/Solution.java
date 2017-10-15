package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        Map<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        while (fileInputStream.available() > 0) {
            int date = fileInputStream.read();
            if (map.containsKey(date)) {
                map.put(date, map.get(date)+1);
            } else map.put(date, 1);
        }

        reader.close();
        fileInputStream.close();

        for (Integer integer : map.keySet()) {
            arrayList.add(integer);
        }

        Collections.sort(arrayList);

        for (Integer i : arrayList) {
            System.out.print(i + " ");
        }
    }
}
