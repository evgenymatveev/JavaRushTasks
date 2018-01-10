package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    private String name;
    private int age;
    private int weight;
    private String address;
    private String color;

    public void initialize(String name) {
        this.name = name;
        this.age = 3;
        this.weight = 5;
        this.color = "black";
    }

    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "black";
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.weight = 5;
        this.age = age;
        this.color = "black";
    }

    public void initialize(int weight, String color) {
        this.color = color;
        this.name = null;
        this.weight = weight;
        this.age = 3;
    }

    public void initialize(int weight, String color, String address) {
        this.color = color;
        this.age = 5;
        this.weight = weight;
        this.address = address;
    }


    public static void main(String[] args) {

    }
}
