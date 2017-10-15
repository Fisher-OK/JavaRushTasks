package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // напишите тут ваши переменные и конструкторы
        private String name;
        private String lastName;
        private String adress;
        private int age;
        private double height;
        private boolean sex;

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, String lastName) {
            this.name = name;
            this.lastName = lastName;
        }

        public Human(String name, String lastName, String adress) {
            this.name = name;
            this.lastName = lastName;
            this.adress = adress;
        }

        public Human(String name, String lastName, String adress, int age) {
            this.name = name;
            this.lastName = lastName;
            this.adress = adress;
            this.age = age;
        }

        public Human(String name, String lastName, String adress, int age, double height) {
            this.name = name;
            this.lastName = lastName;
            this.adress = adress;
            this.age = age;
            this.height = height;
        }

        public Human(String name, String lastName, String adress, int age, double height, boolean sex) {
            this.name = name;
            this.lastName = lastName;
            this.adress = adress;
            this.age = age;
            this.height = height;
            this.sex = sex;
        }

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Human(int age, boolean sex) {
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, double height) {
            this.name = name;
            this.height = height;
        }

        public Human(double height, boolean sex) {
            this.height = height;
            this.sex = sex;
        }
    }
}
