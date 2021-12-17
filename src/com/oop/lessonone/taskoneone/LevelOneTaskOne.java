package com.oop.lessonone.taskoneone;

public class LevelOneTaskOne {
    public static void main(String[] args) {
        Product prod1 = new Product();
        System.out.println("Empty product by constructor without params: " + prod1);

        Product prod2 = new Product(100, "this is some test prod #2", 2500);
        System.out.println("Product created and initialized by constructor: " + prod2);

        prod1.setDescription("Prod1 description");
        System.out.println("Prod1 description: " + prod1.getDescription());
        prod1.setPrice(50);
        prod1.setWeight(4);
        prod1.updateDescription("Note that this is note");
        System.out.println("Prod1 description after update: " + prod1.getDescription());
    }
}
