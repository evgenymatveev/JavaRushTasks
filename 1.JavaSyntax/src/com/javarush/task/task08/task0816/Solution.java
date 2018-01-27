package com.javarush.task.task08.task0816;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1990"));
        map.put("Stallone2", new Date("MAY 1 1984"));
        map.put("Stallone3", new Date("JANUARY 1 1985"));
        map.put("Stallone4", new Date("JULY 6 1987"));
        map.put("Stallone5", new Date("JUNE 21 1988"));
        map.put("Stallone6", new Date("SEPTEMBER 1 1980"));
        map.put("Stallone7", new Date("AUGUST 1 1992"));
        map.put("Stallone8", new Date("JUNE 15 1989"));
        map.put("Stallone9", new Date("OCTOBER 30 1990"));
        map.put("Stallone10", new Date("APRIL 13 1982"));
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        Iterator <HashMap.Entry<String, Date>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            int month = it.next().getValue().getMonth();
            if(month > 4 && month < 8) {
                it.remove();
            }
        }
    }

    public static void main(String[] args) {

    }
}
