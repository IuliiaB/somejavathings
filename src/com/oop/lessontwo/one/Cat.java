package com.oop.lessontwo.one;

public class Cat extends Animal {
    private String name;

    public Cat() {
    }

    public Cat(String ration, String color, int weight, String name) {
        super(ration, color, weight);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat {" +
                "name='" + name + '\'' +
                '}'
                + "; it is " + super.toString();
    }

    @Override
    public String getVoice() {
        return "Cat says meow";
    }

    @Override
    public void eat() {
        System.out.println("The cat is eating");
    }

    @Override
    public void sleep() {
        System.out.println("The cat is sleeping");
        ;
    }
}
