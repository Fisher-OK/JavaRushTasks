package com.javarush.task.task14.task1408;

/**
 * Created by Admin on 15.08.2017.
 */
public class MoldovanHen extends Hen implements Country {
    int getCountOfEggsPerMonth() {
        return 7;
    }

    String getDescription() {
        return super.getDescription() + " Моя страна - " + MoldovanHen.MOLDOVA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}