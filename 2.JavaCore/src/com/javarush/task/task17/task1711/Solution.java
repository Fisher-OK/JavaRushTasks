package com.javarush.task.task17.task1711;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        //start here - начни тут
        Person person;
        switch (args[0]) {
            case "-c":
                synchronized (allPeople) {
                    DateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
                    Date date = format.parse(args[3]);
                    if (args[2].equals("м")) {
                        person = Person.createMale(args[1], date);
                        allPeople.add(person);
                        System.out.println(allPeople.indexOf(person));
                    } else if (args[2].equals("ж")) {
                        person = Person.createFemale(args[1], date);
                        allPeople.add(person);
                        System.out.println(allPeople.indexOf(person));
                    }
                    if (args.length > 4) {
                        String name = "";
                        String sex = "";
                        for (int i = 4; i < args.length; i++) {
                            if (((i - 1) % 3) == 0) {
                                name = args[i];
                            } else if (((i - 2) % 3) == 0) {
                                sex = args[i];
                            } else if ((i % 3) == 0) {
                                date = format.parse(args[i]);
                                if (sex.equals("м")) {
                                    person = Person.createMale(name, date);
                                    allPeople.add(person);
                                    System.out.println(allPeople.indexOf(person));
                                } else if (sex.equals("ж")) {
                                    person = Person.createFemale(name, date);
                                    allPeople.add(person);
                                    System.out.println(allPeople.indexOf(person));
                                }
                            }
                        }
                    }
                }
                break;
            case "-u":
                synchronized (allPeople) {
                    int id1 = 0;
                    String name = "";
                    String sex = "";
                    DateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
                    Date date = format.parse(args[4]);
                    if (args[3].equals("м")) {
                        allPeople.set(Integer.parseInt(args[1]), Person.createMale(args[2], date));
                    } else if (args[3].equals("ж")) {
                        allPeople.set(Integer.parseInt(args[1]), Person.createFemale(args[2], date));
                    }
                    if (args.length > 5) {
                        for (int i = 5; i < args.length; i++) {
                            if (((i - 1) % 4) == 0) {
                                id1 = Integer.parseInt(args[i]);
                            } else if (((i - 2) % 4) == 0) {
                                name = args[i];
                            } else if (((i - 3) % 4) == 0) {
                                sex = args[i];
                            } else if ((i % 4) == 0) {
                                date = format.parse(args[i]);
                                if (sex.equals("м")) {
                                    allPeople.set(id1, Person.createMale(name, date));
                                } else if (sex.equals("ж")) {
                                    allPeople.set(id1, Person.createFemale(name, date));
                                }
                            }
                        }
                    }
                }
                break;
            case "-d":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        allPeople.get(Integer.parseInt(args[i])).setName(null);
                        allPeople.get(Integer.parseInt(args[i])).setSex(null);
                        allPeople.get(Integer.parseInt(args[i])).setBirthDay(null);
                    }
                }
                break;
            case "-i":
                synchronized (allPeople) {
                    DateFormat format = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
                    String name = "";
                    String date = "";
                    for (int i = 1; i < args.length; i++) {
                        name = allPeople.get(Integer.parseInt(args[i])).getName();
                        date = format.format(allPeople.get(Integer.parseInt(args[i])).getBirthDay());
                        if (allPeople.get(Integer.parseInt(args[i])).getSex() == Sex.MALE) {
                            System.out.println(name + " " + "м" + " " + date);
                        } else if (allPeople.get(Integer.parseInt(args[i])).getSex() == Sex.FEMALE) {
                            System.out.println(name + " " + "ж" + " " + date);
                        }

                    }
                }
                break;
        }
    }
}
