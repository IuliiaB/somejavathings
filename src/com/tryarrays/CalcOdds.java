package com.tryarrays;

public class CalcOdds {

    public static void main(String[] args) {

        int[] array1 = {0, 5, 2, 4, 7, 1, 3, 19};
        int oddAmount = 0;
        for (int el : array1) {
            if (el % 2 != 0) {
                oddAmount++;
            }
        }
        System.out.println("There are " + oddAmount + " odd numbers in the array.");
    }
}
