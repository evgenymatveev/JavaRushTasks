package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int index1 = 0;
        int index2 = 0;
        for(int i = 0; i < 3; i++) {
            int x = scanner.nextInt();
            if(x > 0) {
                index1++;
            } else if(x < 0) {
                index2++;
            } else {
            }

        }
        System.out.println("количество положительных чисел: " + index1 + "," + " количество отрицательных чисел: " + index2);
    }
}
