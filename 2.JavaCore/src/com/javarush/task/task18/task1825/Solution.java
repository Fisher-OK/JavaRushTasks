package com.javarush.task.task18.task1825;

/* 
Собираем файл
*/

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            Map<Integer, String> map = new TreeMap<>();
            String tmp, fileName = "";
            while (!(tmp = reader.readLine()).equals("end")) {
                map.put(Integer.parseInt(tmp.substring(tmp.lastIndexOf("t")+1)),tmp);
                fileName = tmp;
            }

            reader.close();
            FileOutputStream fileWrite = new FileOutputStream(fileName.substring(0, fileName.lastIndexOf(".")));
            for (String s : map.values()) {
                FileInputStream fileRead = new FileInputStream(s);
                byte[] buffer = new byte[fileRead.available()];
                fileRead.read(buffer);
                fileWrite.write(buffer);
                fileRead.close();
            }
            fileWrite.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
