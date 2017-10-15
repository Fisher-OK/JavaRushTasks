package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        ArrayList<String> list = new ArrayList<>();

        BufferedReader fileRead = new BufferedReader(new FileReader(fileName));

        String s = "";
        String id = args[1];

        if ("-u".equals(args[0])) {
                while ((s = fileRead.readLine()) != null) {
                    if (!s.isEmpty()) {
                        String tmp = s.substring(0, 8).trim();
                        if (id.equals(tmp)) {
                            list.add(String.format("%-8s%-30s%-8s%-4s", id, args[2], args[3], args[4]));
                        } else {
                            list.add(s);
                        }
                    }
                }

                fileRead.close();

            BufferedWriter fileWrite = new BufferedWriter(new FileWriter(fileName));
            for (int i = 0; i < list.size(); i++) {
                fileWrite.write(list.get(i));
                fileWrite.newLine();
            }
            fileWrite.close();
        }

        if ("-d".equals(args[0])) {
            while ((s = fileRead.readLine()) != null) {
                if (!s.isEmpty()) {
                    String tmp = s.substring(0, 8).trim();
                    if (id.equals(tmp)) {
                    } else {
                        list.add(s);
                    }
                }
            }

            fileRead.close();

            BufferedWriter fileWrite = new BufferedWriter(new FileWriter(fileName));
            for (int i = 0; i < list.size(); i++) {
                fileWrite.write(list.get(i));
                fileWrite.newLine();
            }
            fileWrite.close();
        }
    }
}
