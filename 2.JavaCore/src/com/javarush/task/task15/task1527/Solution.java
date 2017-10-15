package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = reader.readLine();
        String s2 = s.substring(s.indexOf('?') + 1, s.length());
        String sDouble = "";
        String[] masStr = s2.split("&");
        ArrayList<String> arrayString = new ArrayList<>();
        ArrayList<String> arrayStringDouble = new ArrayList<>();

        for (String ss : masStr) {
            if (ss.contains("obj")) {
                arrayString.add("obj");
                arrayStringDouble.add(ss.substring(4, ss.length()));
            } else if (ss.contains("=")) {
                arrayString.add(ss.substring(0, ss.indexOf('=')));
            } else arrayString.add(ss);
        }

        for (String s3 : arrayString) {
            System.out.print(s3 + " ");
        }

        System.out.println();

        for (String s3 : arrayString) {
            if (s3.equals("obj")) {
                for (String s4 : arrayStringDouble) {
                    try {
                        alert(Double.parseDouble(s4));
                    } catch (NumberFormatException e) {
                        alert(s4);
                    }
                }
            }
        }

    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
