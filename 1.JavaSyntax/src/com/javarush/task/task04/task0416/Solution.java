package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextDouble()) {
            double n = scanner.nextDouble();
            if (n >= 0 && n <= 2.9 || n % 5 >= 0 && n % 5 < 3) {
                System.out.println("зелёный");
            } else if (n >= 3 && n < 4 || n % 5 >= 3 && n % 5 < 4) {
                System.out.println("жёлтый");
            } else {
                System.out.println("красный");
            }
        }

    }
}



