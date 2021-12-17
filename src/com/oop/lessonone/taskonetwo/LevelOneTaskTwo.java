package com.oop.lessonone.taskonetwo;

public class LevelOneTaskTwo {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(3.3, 4, 5.8);
        Triangle triangle2 = new Triangle(8, 3, 8);
        Triangle triangle3 = new Triangle(2.5, 5.5, 4.8);

        System.out.println("Triangle #1 area = " + triangle1.getArea());
        System.out.println("Triangle #2 area = " + triangle2.getArea());
        System.out.println("Triangle #3 area = " + triangle3.getArea());
    }

}
