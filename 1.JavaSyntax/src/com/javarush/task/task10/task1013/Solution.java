package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private int age;
        private int weight;
        private int hight;
        private String colorHair;
        private boolean work;

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Human(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public Human(String name, int age, int weight, int hight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.hight = hight;
        }

        public Human(String name, int age, int weight, int hight, String colorHair) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.hight = hight;
            this.colorHair = colorHair;
        }

        public Human(String name, int age, int weight, int hight, String colorHair, boolean work) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.hight = hight;
            this.colorHair = colorHair;
            this.work = work;
        }

        public Human(String name, String colorHair) {
            this.name = name;
            this.colorHair = colorHair;
        }

        public Human(String name, int age, boolean work) {
            this.name = name;
            this.age = age;
            this.work = work;
        }

        public Human(String name, boolean work) {
            this.name = name;
            this.work = work;
        }

        public Human(String name, int age, int weight, String colorHair, boolean work) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.colorHair = colorHair;
            this.work = work;
        }
    }
}
