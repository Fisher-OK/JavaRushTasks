package com.javarush.task.task14.task1419;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.NotActiveException;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (Exception e1) {
            exceptions.add(e1);
        }
        try {
            int[] mas = new int[2];
            mas[5] = 7;
        } catch (Exception e2) {
            exceptions.add(e2);
        }

        try {
            File f = new File("sfsdf");
            FileReader fileReader = new FileReader(f);
        } catch (FileNotFoundException e3) {
            exceptions.add(e3);
        }
        try {
            Object[] x = new String[6];
            x[2] = new Integer(8);
        } catch (Exception e4) {
            exceptions.add(e4);
        }
        try {
            Object o = new Integer(8);
            String s = (String)o;
        } catch (Exception e5) {
            exceptions.add(e5);
        }
        try {
            byte b = -125;
            byte b2 = -97;
            byte[] b3 = new byte[b + b2];
        } catch (Exception e6) {
            exceptions.add(e6);
        }
        try {
            String s = "sefsf";
            int i = Integer.parseInt(s);
        } catch (NumberFormatException e7) {
            exceptions.add(e7);
        }
        try {
            throw new IllegalAccessException();
        } catch (Exception e8) {
            exceptions.add(e8);
        }
        try {
            List list = null;
            list.get(10);
        } catch (Exception e9) {
            exceptions.add(e9);
        }
        try {
            throw new NotActiveException();
        } catch (Exception e10) {
            exceptions.add(e10);
        }
        //напишите тут ваш код

    }
}
