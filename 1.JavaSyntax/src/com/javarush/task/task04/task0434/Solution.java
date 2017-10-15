package com.javarush.task.task04.task0434;


/* 
Таблица умножения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int line = 1;
        int row = 1;
        while (line <= 10)
        {
            while (row <= 10)
            {
                System.out.print(line*row + " ");
                row++;
            }
            System.out.println();
            line++;
            row = 1;
        }

    }
}
