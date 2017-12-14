package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int result = 0;
        String str = Integer.toString(number);
        char[] arr = str.toCharArray();
        for(int i = 0; i < arr.length; i++) {
            result += Integer.parseInt(Character.toString(arr[i]));
        }
        return result;
    }
}