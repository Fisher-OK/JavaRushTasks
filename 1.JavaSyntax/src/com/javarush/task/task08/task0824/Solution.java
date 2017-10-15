package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        Human human1 = new Human("Rebenok1", true, 12);
        Human human2 = new Human("Rebenok2", false, 15);
        Human human3 = new Human("Rebenok3", true, 17);

        Human human4 = new Human("Papa", true, 53, human1, human2, human3);
        Human human5 = new Human("Mama", false, 54, human1, human2, human3);

        Human human6 = new Human("Ded1", true, 75, human4);
        Human human7 = new Human("Babka1", false, 75, human4);

        Human human8 = new Human("Ded2", true, 76, human5);
        Human human9 = new Human("Babka2", false, 76, human5);

        System.out.println(human1.toString());
        System.out.println(human2.toString());
        System.out.println(human3.toString());
        System.out.println(human4.toString());
        System.out.println(human5.toString());
        System.out.println(human6.toString());
        System.out.println(human7.toString());
        System.out.println(human8.toString());
        System.out.println(human9.toString());



    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human child1) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children.add(child1);
        }
        public Human(String name, boolean sex, int age, Human child1, Human child2, Human child3) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children.add(child1);
            this.children.add(child2);
            this.children.add(child3);
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                    //text += ", " + this.children.get(i);
                }
            }
            return text;
        }
    }

}
