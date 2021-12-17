package com.tryarrays;

import java.util.Scanner;

public class CountSymbolInRow {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String userStr = sc.nextLine();

        char[] userStrCharArr = userStr.toCharArray();
        int count = 0;
        char searchSymbol = 'b';
        for (char symbol : userStrCharArr) {
            if (symbol == searchSymbol) {
                count++;
            }
        }
        System.out.println("There are " + count + " symbols 'b' in the string");
    }
}
