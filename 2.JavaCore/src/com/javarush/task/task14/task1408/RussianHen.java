package com.javarush.task.task14.task1408;

/**
 * Created by Admin on 15.08.2017.
 */
public class RussianHen extends Hen implements Country {
    int getCountOfEggsPerMonth() {
        return 33;
    }

    String getDescription() {
        return super.getDescription() + " Моя страна - " + RussianHen.RUSSIA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
