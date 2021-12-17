package com.loops;

import java.util.Scanner;

public class Wallpapers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of repeats: ");
        int num = sc.nextInt();

        for (int i = 1; i <= 5; i ++) {
            for (int j = 1; j<=num; j++){
                if (j % 2 == 0) {
                    System.out.print("+++");
                } else {
                    System.out.print("***");
                }
            }
            System.out.println("");
        }
    }
}
