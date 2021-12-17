package com.tryarrays;

import java.util.Arrays;
import java.util.Scanner;

public class CreateAndFillArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length");
        int length = sc.nextInt();
        int[] array1 = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.println("Enter the " + i + " element of array.");
            array1[i] = sc.nextInt();
        }

        System.out.println("The resulting arrays is: " + Arrays.toString(array1));
    }
}
