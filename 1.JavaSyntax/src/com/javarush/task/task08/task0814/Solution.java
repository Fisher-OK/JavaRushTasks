package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        //напишите тут ваш код
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(5);
        hashSet.add(6);
        hashSet.add(7);
        hashSet.add(8);
        hashSet.add(9);
        hashSet.add(10);
        hashSet.add(11);
        hashSet.add(12);
        hashSet.add(13);
        hashSet.add(14);
        hashSet.add(15);
        hashSet.add(16);
        hashSet.add(17);
        hashSet.add(18);
        hashSet.add(19);
        hashSet.add(20);

        return hashSet;

    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        //напишите тут ваш код
        Iterator<Integer> integerIterator = set.iterator();
        while (integerIterator.hasNext()) {
            if (integerIterator.next() > 10)
                integerIterator.remove();
        }

        return set;

    }

    public static void main(String[] args) {

//        HashSet<Integer> set2 = removeAllNumbersMoreThan10(createSet());
//
//        Iterator<Integer> integerIterator2 = set2.iterator();
//        while (integerIterator2.hasNext()) {
//            System.out.println(integerIterator2.next());
//        }
    }
}
