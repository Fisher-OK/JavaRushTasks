package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        Map<Integer, Integer> map = new HashMap<>();

        while (fileInputStream.available() > 0) {
            int date = fileInputStream.read();
            if (map.containsKey(date)) {
                map.put(date, map.get(date) + 1);
            } else map.put(date, 1);
        }

        reader.close();
        fileInputStream.close();

        if (map.size() <= 0) return;
        else {
            int min = Collections.min(map.values());

            for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
                if (pair.getValue().equals(min)) {
                    System.out.print(pair.getKey() + " ");
                }
            }
        }
    }
}
