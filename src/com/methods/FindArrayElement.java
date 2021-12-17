package com.methods;

import java.util.Arrays;

public class FindArrayElement {
    public static void main(String[] args) {

        int length = 21;
        int[] testArray = new int[length];
        for (int i = 0; i < length; i++) {
            testArray[i] = (int) (20 + Math.random() * 7);
        }
        System.out.println("Test Array is: " + Arrays.toString(testArray));
        System.out.println("result: " + searchForValue(22, testArray));

    }

    public static int searchForValue(int value, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
