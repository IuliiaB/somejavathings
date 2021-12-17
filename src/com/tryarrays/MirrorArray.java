package com.tryarrays;

import java.util.Arrays;
import java.util.Scanner;

public class MirrorArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int length = sc.nextInt();

        int[] array1 = new int[length];
        for (int i = 0; i < length; i++) {
            array1[i] = i;//(int) (10 + Math.random() * 10);
        }
        System.out.println("Original array: " + Arrays.toString(array1));

        int checkIndex = 0;
        if (length % 2 == 0) {
            checkIndex = length / 2 - 1;
        } else {
            checkIndex = length / 2;
        }
        int lastIndex = length - 1;
        for (int i = 0; i <= checkIndex; i++) {
            int temp = array1[i];
            array1[i] = array1[lastIndex - i];
            array1[lastIndex - i] = temp;
        }
        System.out.println("Array after mirroring: " + Arrays.toString(array1));
    }
}
