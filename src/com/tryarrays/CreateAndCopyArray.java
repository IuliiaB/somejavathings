package com.tryarrays;

import java.util.Arrays;

public class CreateAndCopyArray {
    public static void main(String[] args) {
        int length = 15;
        int[] origin = new int[length];
        for (int i = 0; i < origin.length; i++) {
            origin[i] = (int) (2 + Math.random() * 3);
        }

        int[] copy = Arrays.copyOf(origin, length * 2);
        for (int i = length; i < length * 2; i++) {
            copy[i] = origin[i - length] * 2;
        }

        System.out.println("Original array:           " + Arrays.toString(origin));
        System.out.println("Copied and updated array: " + Arrays.toString(copy));
    }
}
