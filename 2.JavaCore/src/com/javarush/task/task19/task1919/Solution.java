package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];

//        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        Map<String, Double> map = new TreeMap<>();
        while (bufferedReader.ready()) {
            String[] s;
            s = bufferedReader.readLine().trim().split(" ");
//                if (map.containsKey(s)) {
//                    map.put(s[0], (map.get(s) + Double.parseDouble(s[1])));
//                } else {
//                    map.put(s[0], Double.parseDouble(s[1]));
//                }
            map.put(s[0], map.containsKey(s[0]) ? map.get(s[0]) + Double.parseDouble(s[1]) : Double.parseDouble(s[1]));
        }

//        map.entrySet().stream().sorted(Map.Entry.<String, Double>comparingByValue());

        for (Map.Entry<String, Double> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }

        bufferedReader.close();
    }
}
