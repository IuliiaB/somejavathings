package com.javastart.lessontwo;

import java.util.Scanner;

public class PrintFiveDigitsNumAsColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number - 5 digits");
        int number = sc.nextInt();

        int part1 = number / 10000;
        int part2 = number % 10000 / 1000;
        int part3 = number % 1000 / 100;
        int part4 = number % 100 /10;
        int part5 = number % 10;
        System.out.println(part1);
        System.out.println(part2);
        System.out.println(part3);
        System.out.println(part4);
        System.out.println(part5);

    }
}
