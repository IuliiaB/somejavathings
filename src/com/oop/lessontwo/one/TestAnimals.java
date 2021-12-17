package com.oop.lessontwo.one;

public class TestAnimals {
    public static void main(String[] args) {
        Cat myCat = new Cat("chicken", "grey", 2, "Simba");
        Dog myDog = new Dog("beef", "brown", 15, "Freddy");
        Veterinarian animalDoc = new Veterinarian("Doctor Sam");
        animalDoc.treatment(myDog);
        animalDoc.treatment(myCat);
    }
}
