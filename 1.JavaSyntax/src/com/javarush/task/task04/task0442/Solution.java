package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int summ = 0;
        if (scanner.hasNextInt()) {
            while (n != -1) {
                n = scanner.nextInt();
                summ = summ + n;
            }
            System.out.println(summ);
        }
    }
}
