package com.lessonseven;

public class TenPi {
    public static void main(String[] args) {
        for (int i = 2; i < 12; i++) {
            System.out.println(String.format("%d) There is Pi with %d accuracy: %." + i + "f", i - 1, i, Math.PI));
        }
    }
}
