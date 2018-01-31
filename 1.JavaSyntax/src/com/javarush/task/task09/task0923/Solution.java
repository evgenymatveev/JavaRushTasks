package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;/*
Гласные и согласные
*/
import java.util.ArrayList;

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Character> arr_1 = new ArrayList<>();
        ArrayList<Character> arr_2 = new ArrayList<>();
        String str = reader.readLine();
        String[] arrString = str.split(" ");
        for (String s : arrString) {
            char[] ch = s.toCharArray();
            for (char aCh : ch) {
                if (isVowel(aCh)) {
                    arr_1.add(aCh);
                } else {
                    arr_2.add(aCh);
                }
            }
        }
        for (char a : arr_1) {
            System.out.print(a + " ");
        }
        System.out.println();
        for (char a : arr_2) {
            System.out.print(a + " ");
        }

    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}