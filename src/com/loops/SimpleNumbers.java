package com.loops;

public class SimpleNumbers {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (i > 3) {
                for (int j = 2; j <= i; j++) {
                    if (i % j == 0) {
                        if (j < i) {
                            break;
                        } else {
                            System.out.println(i);
                        }
                    }
                }
            } else {
                System.out.println(i);
            }
        }
    }
}
