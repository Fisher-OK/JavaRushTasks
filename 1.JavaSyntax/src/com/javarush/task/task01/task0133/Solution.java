package com.javarush.task.task01.task0133;

/* 
Не думать о секундах…
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getCountSecondsPassedInCurrentHour(12345));
    }

    public static int getCountSecondsPassedInCurrentHour(int seconds) {
        //напишите тут ваш код
        int hours, sec;
        hours = seconds/3600;
        return sec = seconds - hours*3600;
    }
}