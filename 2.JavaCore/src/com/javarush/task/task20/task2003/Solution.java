package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.regex.Matcher;

/* 
Знакомство с properties
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();

    public void fillInPropertiesMap() {
        //implement this method - реализуйте этот метод
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            FileInputStream fileInputStream = new FileInputStream(bufferedReader.readLine());
            load(fileInputStream);
            bufferedReader.close();
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void save(OutputStream outputStream) throws Exception {
        //implement this method - реализуйте этот метод
        PrintWriter printWriter = new PrintWriter(outputStream);

        Properties prop = new Properties();
        prop.putAll(properties);
        prop.store(printWriter, "");
        printWriter.flush();

    }

    public void load(InputStream inputStream) throws Exception {
        //implement this method - реализуйте этот метод
        Properties prop = new Properties();
        prop.load(inputStream);
        for (Map.Entry<Object, Object> pair : prop.entrySet()) {
            properties.put((String) pair.getKey(), (String) pair.getValue());
        }

    }

    public static void main(String[] args) {

    }
}
