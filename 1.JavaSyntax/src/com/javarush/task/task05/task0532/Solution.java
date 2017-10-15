package com.javarush.task.task05.task0532;

import java.io.*;
import java.util.ArrayList;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        int count = Integer.parseInt(reader.readLine());

        //напишите тут ваш код
        for (int i = 0; i < count; i++) {
            arrayList.add(Integer.parseInt(reader.readLine()));
        }

        maximum = arrayList.get(0);
        for (int i = 1; i < arrayList.size(); i++) {
            if (maximum < arrayList.get(i))
                maximum = arrayList.get(i);
        }

        System.out.println(maximum);
    }
}
