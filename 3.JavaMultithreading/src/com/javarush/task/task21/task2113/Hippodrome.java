package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 03.10.2017.
 */
public class Hippodrome {
    private List<Horse> horses;
    public static Hippodrome game;

    public Hippodrome(List<Horse> horseList) {
        this.horses = horseList;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public void run() {
        try {
            for (int i = 0; i < 100; i++) {
                move();
                print();
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void move() {
        for (int i = 0; i < horses.size(); i++) {
            horses.get(i).move();
        }
    }

    public void print() {
        for (int i = 0; i < horses.size(); i++) {
            horses.get(i).print();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

    public Horse getWinner() {
        double distMax = horses.get(0).getDistance();
        Horse horse = horses.get(0);
        for (int i = 0; i < horses.size(); i++) {
            double disttmp = horses.get(i).getDistance();
            if (disttmp > distMax) {
                distMax = disttmp;
                horse = horses.get(i);
            }
        }
        return horse;
    }

    public void printWinner() {
        System.out.println("Winner is " + getWinner().getName() + "!");
    }

    public static void main(String[] args) {
        Horse horse1 = new Horse("horse1", 3, 0);
        Horse horse2 = new Horse("horse2", 3, 0);
        Horse horse3 = new Horse("horse3", 3, 0);

        List<Horse> listHorsetmp = new ArrayList<>();
        listHorsetmp.add(horse1);
        listHorsetmp.add(horse2);
        listHorsetmp.add(horse3);

        game = new Hippodrome(listHorsetmp);

        game.run();
        game.printWinner();
    }
}
