package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
*/

public class Solution {
    public static volatile int countSeconds = 3;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        //add your code here - добавь код тут
        //Thread thread = new Thread(clock);

        Thread.sleep(3500);
        clock.interrupt();
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            //add your code here - добавь код тут
            try {
                while (countSeconds > 0 ) {
                    //if (countSeconds < 3.5)
                    System.out.print(countSeconds + " ");
                    countSeconds--;
                    Thread.sleep(1000);
                }
                System.out.print("Марш!");
            } catch (InterruptedException e) {
                System.out.print("Прервано!");
            }
        }
    }
}
