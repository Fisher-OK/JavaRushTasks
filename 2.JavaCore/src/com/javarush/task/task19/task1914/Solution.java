package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);

        testString.printSomething();

        System.setOut(consoleStream);

        String result = outputStream.toString();
        Matcher m = Pattern.compile("(\\d+) ([\\+\\-\\*]) (\\d+)").matcher(result);
        while (m.find()) {
            if (m.group(2).equals("+")) {
                System.out.print(result + (Integer.parseInt(m.group(1)) + Integer.parseInt(m.group(3))));
            } else if (m.group(2).equals("-")) {
                System.out.print(result + (Integer.parseInt(m.group(1)) - Integer.parseInt(m.group(3))));
            } else if (m.group(2).equals("*")) {
                System.out.print(result + (Integer.parseInt(m.group(1)) * Integer.parseInt(m.group(3))));
            }
        }


    }

    public static class TestString {
        public void printSomething() {
            System.out.print("3 + 6 = ");
        }
    }
}

