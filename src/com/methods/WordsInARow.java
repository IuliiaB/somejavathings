package com.methods;

import java.util.Scanner;

public class WordsInARow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String str = sc.nextLine();
        System.out.println();
        System.out.println("There are " + getWordsNumber(str) + " words in this line");
    }

    public static int getWordsNumber(String row) {
        String[] srt = row.split(" ");
        return srt.length;
    }
}
