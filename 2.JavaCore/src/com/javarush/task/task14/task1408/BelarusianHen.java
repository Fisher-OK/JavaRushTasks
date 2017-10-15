package com.javarush.task.task14.task1408;

/**
 * Created by Admin on 15.08.2017.
 */
public class BelarusianHen extends Hen implements Country {
    int getCountOfEggsPerMonth() {
        return 55;
    }

    String getDescription() {
        return super.getDescription() + " Моя страна - " + BelarusianHen.BELARUS + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
