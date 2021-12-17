package com.loops;

import java.util.Scanner;

public class StarredRectangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter w: ");
        int w = sc.nextInt();
        System.out.println("Enter h: ");
        int h = sc.nextInt();

        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= w; j++) {
                if ((i == 1) || (i == h)) {
                    System.out.print("*");
                    continue;
                }
                if ((j == 1) || (j == w)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
