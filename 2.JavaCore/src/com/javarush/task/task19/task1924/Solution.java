package com.javarush.task.task19.task1924;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Замена чисел
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();

    static {
        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");
        map.put(10, "десять");
        map.put(11, "одиннадцать");
        map.put(12, "двенадцать");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        bufferedReader.close();
        StringBuffer stringBuffer = new StringBuffer();
        String s;


        bufferedReader = new BufferedReader(new FileReader(fileName));

        while (bufferedReader.ready()) {
            s = bufferedReader.readLine().trim();
            Integer key;
            Pattern regexp = Pattern.compile("\\b[0-9]{1,2}\\b");
            Matcher m = regexp.matcher(s);
            while (m.find()) {
                if (map.containsKey(key = Integer.parseInt(m.group())))
                    m.appendReplacement(stringBuffer, map.get(key));
            }
            m.appendTail(stringBuffer);
            System.out.println(stringBuffer.toString());
            stringBuffer.setLength(0);
        }
        bufferedReader.close();
    }
}
