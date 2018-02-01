package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        ArrayList<Integer> listIndexInt = new ArrayList<>();
        ArrayList<Integer> listIndexString = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (isNumber(array[i])) {
                listIndexInt.add(i);
            }
            if (!isNumber(array[i])) {
                listIndexString.add(i);
            }
        }

        for (int a = 0; a < listIndexInt.size(); a++) {
            String min = array[listIndexInt.get(a)];
            int index_max = listIndexInt.get(a);
            for (int b = a + 1; b < listIndexInt.size(); b++) {
                if (Integer.parseInt(array[listIndexInt.get(b)]) > Integer.parseInt(min)) {
                    min = array[listIndexInt.get(b)];
                    index_max = listIndexInt.get(b);
                }
            }
            if (a != index_max) {
                String tmp = array[listIndexInt.get(a)];
                array[listIndexInt.get(a)] = array[index_max];
                array[index_max] = tmp;
            }
        }

        for (int c = 0; c < listIndexString.size(); c++) {
            String tmp2 = null;
            for (int d = 0; d < listIndexString.size(); d++) {
                if (isGreaterThan(array[listIndexString.get(d)], array[listIndexString.get(c)])) {
                    tmp2 = array[listIndexString.get(c)];
                    array[listIndexString.get(c)] = array[listIndexString.get(d)];
                    array[listIndexString.get(d)] = tmp2;
                }
            }
        }

    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-')) // не цифра и не начинается с '-'
            {
                return false;
            }
        }
        return true;
    }
}
