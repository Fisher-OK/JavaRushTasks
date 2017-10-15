package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];

        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        String[] s;
        Map<String, Double> map = new TreeMap<>();


        while (bufferedReader.ready()) {
            s = bufferedReader.readLine().split(" ");
            map.put(s[0], map.containsKey(s[0]) ? map.get(s[0]) + Double.parseDouble(s[1]) : Double.parseDouble(s[1]));

        }

        Double max = Collections.max(map.values());
//        for (Double d : map.values()) {
//            if (max < d) max = d;
//        }

        for (Map.Entry<String, Double> pair : map.entrySet()) {
            if (pair.getValue().equals(max))
                System.out.println(pair.getKey());
        }

        bufferedReader.close();
    }
}
