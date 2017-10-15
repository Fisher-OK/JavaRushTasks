package com.javarush.task.task17.task1710;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        //start here - начни тут

        String flag = args[0];

        if (flag.equals("-c")) {
            Person person;
            DateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
            Date date = format.parse(args[3]);
            String sex = args[2];
            if (sex.equals("м")) {
                person = Person.createMale(args[1], date);
                allPeople.add(person);
                System.out.println(allPeople.indexOf(person));
            } else if (sex.equals("ж")) {
                person = Person.createFemale(args[1], date);
                allPeople.add(person);
                System.out.println(allPeople.indexOf(person));
            }
        } else if (flag.equals("-u")) {
            int id = Integer.parseInt(args[1]);
            DateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
            Date date = format.parse(args[4]);
            String sex = args[3];
            if (sex.equals("м")) {
                allPeople.set(id, Person.createMale(args[2], date));
            } else if (sex.equals("ж")) {
                allPeople.set(id, Person.createFemale(args[2], date));
            }
        } else if (flag.equals("-d")) {
            int id = Integer.parseInt(args[1]);
            allPeople.get(id).setName(null);
            allPeople.get(id).setBirthDay(null);
            allPeople.get(id).setSex(null);
        } else if (flag.equals("-i")) {
            int id = Integer.parseInt(args[1]);
            DateFormat format = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
            Date date = allPeople.get(id).getBirthDay();
            String date2 = format.format(date);
            String name = allPeople.get(id).getName();
            String sex;
            if (allPeople.get(id).getSex() == Sex.MALE)
                sex = "м";
            else sex = "ж";
            System.out.println(name + " " + sex + " " + date2);
        }
    }

}
