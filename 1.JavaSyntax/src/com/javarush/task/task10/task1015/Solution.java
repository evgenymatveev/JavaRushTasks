package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] lists = new ArrayList[2];
        ArrayList<String> list1 = new ArrayList();
        ArrayList<String> list2 = new ArrayList();
        list1.add("1");
        list1.add("2");
        list2.add("3");
        list2.add("4");
        lists[0] = list1;
        lists[1] = list2;
        return lists;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}