package com.javarush.task.task15.task1501;

/* 
ООП - Расставить интерфейсы
*/

import org.omg.CORBA.Object;

public class Solution {
    public static void main(String[] args) {

    }

    public interface Movable {
        boolean isMovable();
    }

    public interface Sellable {
        String getAllowedAction(String name);
    }

    public interface Discountable {
        int getAllowedAction();
    }

    public static class Clothes implements Movable, Sellable, Discountable {
        public boolean isMovable() {
            return true;
        }

        public String getAllowedAction(String name) {
            String s = name;
            return (String) s;
        }

        public int getAllowedAction() {
            int i = 5;
            return i;
        }
    }
}
