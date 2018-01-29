package com.javarush.task.task08.task0827;

import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("JANUARY 1 2000"));
    }

    public static boolean isDateOdd(String date) {
        Date beginDate = new Date();
        Date currentDate = new Date(date);

        beginDate.setHours(0);
        beginDate.setMinutes(0);
        beginDate.setSeconds(0);

        beginDate.setMonth(0);
        beginDate.setDate(1);
        beginDate.setYear(currentDate.getYear());

        long timeDistance = currentDate.getTime() - beginDate.getTime();
        long msDay = 24 * 60 * 60 * 1000;

        int dayCount = (int) (timeDistance / msDay);

        return dayCount % 2 != 0;
    }
}
