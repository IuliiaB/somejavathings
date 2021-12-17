package com.lessonseven;

import java.util.Arrays;

public class MyArraysToString {
    public static void main(String[] args) {
        int length = 15;
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = (int) (11 + Math.random()*6);
        }

        System.out.println("Arrays.toString result: "+Arrays.toString(arr));
        myArrToStringVersion(arr);
    }

    public static void myArrToStringVersion(int[] arr) {
        int length = arr.length;
        StringBuilder str = new StringBuilder("My version: [");
        for (int i = 0; i < arr.length-1; i++) {
            str.append(arr[i] + ", ");
        }
        str.append(arr[length-1] +"]");

        System.out.println(str);
    }
}
