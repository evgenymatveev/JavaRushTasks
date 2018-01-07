package com.javarush.task.task04.task0434;


/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int a = 1;
        int b = 1;
        while (b < 11) {
            while (a < 11) {
                System.out.print(a * b + " ");
                a++;
            }
            a = 1;
            b++;
            System.out.println();
        }
    }
}
