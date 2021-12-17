package com.loops;

import java.util.Scanner;

public class OneLoopFigure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter stars max num: ");
        int num = sc.nextInt();

        int rowsNum = num * 2 - 1;
        String str = "";

        for (int i = 1; i <= rowsNum; i++) {
            if (i <= num) {
                str = str + "*";
                System.out.println(str);
            } else {
                int length = str.length();
                str = str.substring(0, str.length() - 1);
                System.out.println(str);
            }
        }
    }
}
