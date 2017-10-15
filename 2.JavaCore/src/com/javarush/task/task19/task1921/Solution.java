package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {
        String fileName = args[0];

        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));

        while (bufferedReader.ready()) {
            String[] s;
            String fullS = bufferedReader.readLine();
            String name = "";
            String date = "";
//            s = bufferedReader.readLine().trim().split(" ");
//            for (int i = 0; i < s.length; i++) {
//                if (s[i].matches("\\D+")) {
//                    name += " " + s[i];
//                } else if (s[i].matches("\\d+")) {
//                    date += s[i];
//                }
//            }
//
//            Date date1 = new SimpleDateFormat("ddMMyyyy").parse(date);
//            PEOPLE.add(new Person(name, date1));

            name = fullS.replaceAll("\\d+", "").trim();
            date = fullS.substring(name.length() + 1);

            PEOPLE.add(new Person(name, new SimpleDateFormat("dd MM yyyy", Locale.US).parse(date)));
        }

        bufferedReader.close();

    }
}
