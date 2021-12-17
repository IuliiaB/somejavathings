package com.oop.lessontwo.one;

public class Dog extends Animal {
    private String name;

    public Dog() {
    }

    public Dog(String ration, String color, int weight, String name) {
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
        return "Dog {" +
                "name='" + name + '\'' +
                '}'
                + "; it is  " + super.toString();
    }

    @Override
    public String getVoice() {
        return "Dog says bark";
    }

    @Override
    public void eat() {
        System.out.println("The dog is eating");
    }

    @Override
    public void sleep() {
        System.out.println("The dog is sleeping");
        ;
    }
}
