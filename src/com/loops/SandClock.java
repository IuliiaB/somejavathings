package com.loops;

import java.util.Scanner;

public class SandClock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter width:");
        int width = sc.nextInt();
        if (width % 2 == 0) {
            System.out.println("Value must be odd, exit program");
        } else {
            int median = (width - 1) / 2 + 1;
            int w = width;
            for (int i = 1; i <= width; i++) {
                if ((i == 1) || (i == width)) {
                    for (int j = 1; j <= width; j++) {
                        System.out.print("*");
                    }
                } else {
                    if (i < median) {
                        for (int j = 1; j <= i - 1; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= w - 2; j++) {
                            System.out.print("*");
                        }
                        w = w - 2;
                    } else if (i > median) {
                        for (int j = median - 1; j > i - median; j--) {
                            System.out.print(" ");
                        }
                        for (int j = w; j >= 1; j--) {
                            System.out.print("*");
                        }
                        w = w + 2;
                    } else if (i == median) {
                        for (int j = 1; j < i; j++) {
                            System.out.print(" ");
                        }
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
        }
    }
}
