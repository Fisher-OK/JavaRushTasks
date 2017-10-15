package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();

        ArrayList<Integer> arrayList = new ArrayList<>();
//        ArrayList<Integer> arrayList2 = new ArrayList<>();

        Scanner scanner = new Scanner(new FileInputStream(fileName));

        FileInputStream fileInputStream = new FileInputStream(fileName);

        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            if (num % 2 == 0)
                arrayList.add(num);

        }

        Collections.sort(arrayList);
        for (Integer i : arrayList) {
            System.out.println(i);
        }
//        for (int i = 0; i < 6; i++) {
//            arrayList.add(Integer.parseInt(bufferedReader.readLine()));
//        }

//        for (int i = 0; i < arrayList.size(); i++) {
//            if (arrayList.get(i) % 2 == 0)
//                arrayList2.add(arrayList.get(i));
//            else continue;
//        }
//
//        Integer[] array = arrayList2.toArray(new Integer[arrayList2.size()]);
//
//
//        for (int i = array.length-1; i >= 0; i--) {
//            for (int j = 0; j < i; j++) {
//                if (array[j] > array[j+1]) {
//                    int tmp = array[j];
//                    array[j] = array[j+1];
//                    array[j+1] = tmp;
//
//                }
//            }
//
//        }
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }

        fileInputStream.close();
        bufferedReader.close();

    }
}
