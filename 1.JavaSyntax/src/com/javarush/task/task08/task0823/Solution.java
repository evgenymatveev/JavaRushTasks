package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        String[] arrString = s.split(" ");
        for (int i = 0; i < arrString.length; i++) {
            if (arrString[i].length() > 0) {
                String firstLetter = arrString[i].substring(0, 1).toUpperCase();
                arrString[i] = firstLetter + arrString[i].substring(1);
            }
            System.out.print(arrString[i] + " ");
        }
    }
}
