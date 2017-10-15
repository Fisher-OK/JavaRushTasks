package com.javarush.task.task08.task0827;

import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));

    }

    public static boolean isDateOdd(String date) {
        Date date1 = new Date(date);
        //int year = date1.getYear();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("D");
        int d = Integer.parseInt(simpleDateFormat.format(new Date(date)));

//        Date date2 = new Date();
//        date2.setYear(date1.getYear());
//        date2.setDate(1);
//        date2.setMonth(0);
//        date2.setHours(0);
//        date2.setMinutes(0);
//        date2.setSeconds(0);
//
//        //long milSec = date1.getTime() - date2.getTime();
//        //int day = (int)milSec/(1000*3600*24);
//        long day = date1.getDay() - date2.getDay()+1;
        if (d % 2 != 0)
        return true;
        else return false;
    }
}
