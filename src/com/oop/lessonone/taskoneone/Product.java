package com.oop.lessonone.taskoneone;

public class Product {
    private int price;
    private String description;
    private int weight;

    public Product() {
    }

    public Product(int price, String description, int weight) {
        this.price = price;
        this.description = description;
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", description='" + description + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void updateDescription(String infoToAdd) {
        this.description = this.description + ". " + infoToAdd;
    }
}
