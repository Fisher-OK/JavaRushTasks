package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException{

        FileInputStream file = new FileInputStream(args[0]);
        Map<Character, Integer> map = new TreeMap<>();
        byte[] buffer = new byte[file.available()];

        while (file.available() > 0) {
            file.read(buffer);
        }

        Arrays.sort(buffer);

        for (int i = 0; i < buffer.length; i++) {
            if (map.containsKey((char)(buffer[i]))) {
                map.put((char)(buffer[i]), map.get((char)(buffer[i]))+1);
            } else map.put((char)(buffer[i]), 1);
        }

        for (Map.Entry<Character, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }

        file.close();

    }
}
