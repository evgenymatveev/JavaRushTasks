package com.javarush.task.task06.task0611;

/* 
Класс StringHelper
*/

public class StringHelper {
    public static String multiply(String s) {
        String result = "";
        int n = 0;
        while (n < 5) {
            result = result + s;
            n++;
        }

        return result;
    }

    public static String multiply(String s, int count) {
        String result = "";
        int n = 0;
        while (n < count) {
            result = result + s;
            n++;
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
