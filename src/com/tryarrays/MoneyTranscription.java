package com.tryarrays;

import java.util.Scanner;

public class MoneyTranscription {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your money amount:");
        String userInput = sc.nextLine();

        String[] scrArray = userInput.split("[,]]");




        System.out.println("You have: " + " dollars" + "cents");
    }
}
