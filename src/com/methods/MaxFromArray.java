package com.methods;

import java.util.Arrays;

public class MaxFromArray {
    public static void main(String[] args) {

        int length = 21;
        int[] testArray = new int[length];
        for (int i = 0; i < length; i++) {
            testArray[i] = (int) (-15 + Math.random() * 50);
        }
        System.out.println("Test Array is: " + Arrays.toString(testArray));
        System.out.println("max number in test array is " + getMaxNumber(testArray));
    }

    public static int getMaxNumber(int[] arr) {
        int num = -2147483648;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > num) {
                num = arr[i];
            }
        }
        return num;
    }
}
