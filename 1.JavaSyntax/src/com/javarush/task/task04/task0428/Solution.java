package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int index = 0;
        if (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            if (a > 0) {
                index++;
            }
            if (b > 0) {
                index++;
            }
            if (c > 0) {
                index++;
            }
            System.out.println(index);
        }
    }
}





