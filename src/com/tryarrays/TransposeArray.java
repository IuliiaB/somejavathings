package com.tryarrays;

import java.util.Arrays;
import java.util.Scanner;

public class TransposeArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int length = sc.nextInt();
        System.out.println("90, 180 or 270?");

        int turnsInput = sc.nextInt();
        int turns;
        switch (turnsInput) {
            case 90:
                turns = 1;
                break;
            case 180:
                turns = 2;
                break;
            case 270:
                turns = 3;
                break;
            default:
                turns = 0;
                break;
        }

        int[][] array1 = new int[length][length];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                array1[i][j] = i+1;
            }
        }
        System.out.println("Original array:");
        for (int[] arr : array1) {
            System.out.println(Arrays.toString(arr));
        }
        System.out.println("***********************");

        for (int k = 0; k < turns; k++) {
            int tmp1;
            int tmp2;
            int lastIndex = array1.length - 1;
            for (int j = 0; j < array1.length - 1; j++) {
                for (int i = j; i < array1.length - 1 - j; i++) {

                    tmp1 = array1[i][lastIndex - j];
                    array1[i][lastIndex - j] = array1[j][i];

                    tmp2 = array1[lastIndex - j][lastIndex - i];
                    array1[lastIndex - j][lastIndex - i] = tmp1;

                    tmp1 = array1[lastIndex - i][j];
                    array1[lastIndex - i][j] = tmp2;

                    array1[j][i] = tmp1;
                }
            }
        }
        System.out.println("Transposed array:");
        for (int[] arr : array1) {
            System.out.println(Arrays.toString(arr));
        }
    }
}
