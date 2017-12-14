package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
            if(scanner.hasNextInt()) {
                int i = scanner.nextInt();
                    if(i > 0) {
                        System.out.println(i * 2);
                    } else if (i < 0) {
                        System.out.println(i + 1);
                    } else {
                        System.out.println(i);
                    }
            }
    }

}