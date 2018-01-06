package com.javarush.task.task04.task0433;


/* 
Гадание на долларовый счет
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int n1 = 0;
        int n2 = 0;
        while (n1 < 10) {
            while (n2 < 10) {
                System.out.print("S");
                n2++;
            }
            System.out.println();
            n2 = 0;
            n1++;
        }
    }
}
