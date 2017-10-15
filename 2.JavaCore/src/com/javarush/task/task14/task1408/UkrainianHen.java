package com.javarush.task.task14.task1408;

/**
 * Created by Admin on 15.08.2017.
 */
public class UkrainianHen extends Hen implements Country {
    int getCountOfEggsPerMonth() {
        return 15;
    }

    String getDescription() {
        return super.getDescription() + " Моя страна - " + UkrainianHen.UKRAINE + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
