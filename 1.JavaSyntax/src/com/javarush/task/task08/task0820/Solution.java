package com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> resultCat = new HashSet<Cat>();
        for (int i = 0; i < 4; i++) {
            resultCat.add(new Cat());
        }
        return resultCat;
    }

    public static Set<Dog> createDogs() {
        HashSet<Dog> resultDog = new HashSet<Dog>();
        for (int i = 0; i < 3; i++) {
            resultDog.add(new Dog());
        }
        return resultDog;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        Set<Object> setTogether = new HashSet<>();
        setTogether.addAll(cats);
        setTogether.addAll(dogs);
        return setTogether;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        pets.removeAll(cats);
    }

    public static void printPets(Set<Object> pets) {
        for (Object animals : pets) {
            System.out.println(animals);
        }
    }

    public static class Cat {

    }

    public static class Dog {

    }
}
