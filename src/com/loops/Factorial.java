package com.loops;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();

        long mult = 1;
        if ((num > 4) && (num < 16)) {
            for (int i = 1; i <= num; i++) {
                mult = mult * i;
            }
            System.out.println(num + "! = " + mult);
        } else {
            System.out.println("This number is out of desired range");
        }
    }
}
