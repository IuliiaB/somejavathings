package com.lessonseven;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EnterBinaryFromConsole {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your binary value: ");
        try {
            int myIntNum = sc.nextInt(2);
            String myBinaryString = Integer.toBinaryString(myIntNum);
            System.out.println(String.format("%s -> %d", myBinaryString, myIntNum));
        } catch (InputMismatchException e) {
            System.err.println("[CUSTOM_ERR] Input should contain only 0 and 1");
            e.printStackTrace();
        }

    }
}
