package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(bufferedReader.readLine());
        if (x % 2 == 0 && x > 0 && x < 10) {
            System.out.println("четное однозначное число");
        }
        if (x % 2 != 0 && x > 0 && x < 10) {
            System.out.println("нечетное однозначное число");
        }
        if (x % 2 == 0 && x > 9 && x < 100) {
            System.out.println("четное двузначное число");
        }
        if (x % 2 != 0 && x > 9 && x < 100) {
            System.out.println("нечетное двузначное число");
        }
        if (x % 2 == 0 && x > 99 && x < 1000) {
            System.out.println("четное трехзначное число");
        }
        if (x % 2 != 0 && x > 99 && x < 1000) {
            System.out.println("нечетное трехзначное число");
        }
    }
}
