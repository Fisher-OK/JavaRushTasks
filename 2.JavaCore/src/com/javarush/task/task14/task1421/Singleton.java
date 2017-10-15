package com.javarush.task.task14.task1421;

/**
 * Created by Admin on 16.08.2017.
 */
public class Singleton {
    private Singleton() {
    }

    private static Singleton instance;

    public static Singleton getInstance() {
        return instance;
    }

}
