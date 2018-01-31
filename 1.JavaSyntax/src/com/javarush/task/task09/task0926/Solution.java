package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> listArr = new ArrayList<>();
        listArr.add(new int[]{1, 2, 3, 4, 5});
        listArr.add(new int[]{1, 2});
        listArr.add(new int[]{1, 2, 3, 4});
        listArr.add(new int[]{1, 2, 3, 4, 5, 6, 7});
        listArr.add(new int[]{});
        return listArr;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
