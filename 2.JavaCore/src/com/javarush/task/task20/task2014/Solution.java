package com.javarush.task.task20.task2014;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Serializable Solution
*/
public class Solution implements Serializable{
    public static void main(String[] args) {
        File file = new File("C://13.txt");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            FileInputStream fileInputStream = new FileInputStream(file);

            Solution savedObject = new Solution(13);
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(savedObject);

            ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
            Solution loadedObject = (Solution) inputStream.readObject();

            if (savedObject.string.equals(loadedObject.string))
                System.out.println("true");
            else System.out.println("false");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(new Solution(4));
    }

    transient private final String pattern = "dd MMMM yyyy, EEEE";
    transient private Date currentDate;
    transient private int temperature;
    String string;

    public Solution(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }
}
