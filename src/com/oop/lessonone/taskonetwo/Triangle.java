package com.oop.lessonone.taskonetwo;

public class Triangle {
    private double lengthA;
    private double lengthB;
    private double lengthC;

    public Triangle() {
    }

    public Triangle(double lengthA, double lengthB, double lengthC) {
        this.lengthA = lengthA;
        this.lengthB = lengthB;
        this.lengthC = lengthC;
    }

    public double getLengthA() {
        return lengthA;
    }

    public void setLengthA(double lengthA) {
        this.lengthA = lengthA;
    }

    public double getLengthB() {
        return lengthB;
    }

    public void setLengthB(double lengthB) {
        this.lengthB = lengthB;
    }

    public double getLengthC() {
        return lengthC;
    }

    public void setLengthC(double lengthC) {
        this.lengthC = lengthC;
    }

    public double getArea() {
        double halfP = (this.lengthA + this.lengthB + this.lengthC) / 2;
        return Math.sqrt(halfP * (halfP - this.lengthA) * (halfP - this.lengthB) * (halfP - this.lengthC));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "lengthA=" + lengthA +
                ", lengthB=" + lengthB +
                ", lengthC=" + lengthC +
                '}';
    }
}
