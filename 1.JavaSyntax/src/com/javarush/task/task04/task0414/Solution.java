package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        String x = "";
        Scanner scanner = new Scanner(System.in);
            if(scanner.hasNextInt()) {
                int year = scanner.nextInt();
                    if(year % 100 == 0 && year % 400 == 0) {
                        x = "365";
                        System.out.println("количество дней в году: " + x);
                    } else if(year % 100 == 0 && year % 400 != 0) {
                        x = "366";
                        System.out.println("количество дней в году: " + x);
                    } else {
                        x = "365";
                        System.out.println("количество дней в году: " + x);
                    }
            }
    }
}