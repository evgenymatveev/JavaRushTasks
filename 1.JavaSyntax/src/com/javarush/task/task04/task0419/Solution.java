package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int max1 = maxNumber(a, b);
        int max2 = maxNumber(c, d);
        if (max1 > max2) {
            System.out.println(max1);
        } else {
            System.out.println(max2);
        }

    }

    private static int maxNumber(int a, int b) {
        int max = a;
        if (b > a) {
            max = b;
        }
        return max;
    }
}
