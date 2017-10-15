package com.javarush.task.task10.task1011;

/* 
Большая зарплата
*/

public class Solution {
    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";

        //напишите тут ваш код
        for (int i = 0; i < 40; i++) {

            System.out.println(s);
            s = s.substring(1, s.length());

//            if (i == 0) {
//                System.out.println(s);
//                i++;
//                continue;
//            }
//            else if (i%3 != 0 && i != 0) {
//                s = s.substring(2, s.length());
//                System.out.println(s);
//                System.out.println(s);
//                i = i+2;
//                continue;
//            } else if (i%3 == 0 && i != 0) {
//                s = s.substring(1, s.length());
//                System.out.println(s);
//                i++;
//                continue;
//            }

        }
    }

}

