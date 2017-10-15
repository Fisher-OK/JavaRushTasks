package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.sql.Date;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner{
        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }


        @Override
        public Person read() throws IOException {
            String s = fileScanner.nextLine();
            String[] arraystring = s.trim().split(" ");
            Person person = new Person(arraystring[1], arraystring[2], arraystring[0], Date.valueOf(arraystring[3]));
            return person;
        }

        @Override
        public void close() {
            fileScanner.close();
        }
    }
}
