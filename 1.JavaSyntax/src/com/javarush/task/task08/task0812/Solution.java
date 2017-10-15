package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        int count = 1, max = 1;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        //ArrayList<Integer> arrayList2 = new ArrayList();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            arrayList.add(Integer.parseInt(reader.readLine()));
        }

        for (int i = 1; i < arrayList.size(); i++) {
                if (arrayList.get(i) == arrayList.get(i-1)) {
                    count++;
                    if (max < count)
                        max = count;
                }
                else
                    //arrayList2.add(count);
                    count = 1;


        }

//        max = arrayList2.get(0);
//        for (int i = 1; i < arrayList2.size(); i++) {
//            if (max < arrayList2.get(i))
//                max = arrayList2.get(i);
//        }

        System.out.println(max);

    }
}