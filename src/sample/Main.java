package sample;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arr = new int[]{0, 2, -3, 5, 6};
        System.out.println(Arrays.toString(getPositive(arr)));
    }

    public static int getSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    public static int[] getPositive(int[] array) {
        int [] result = new int[countPositiveNumbers(array)];
        int resultCounter = 0;
        for (int i=0; i< array.length; i++) {
            if (array[i] > 0) {
                result[resultCounter] = array[i];
                resultCounter++;
            }
        }
        return result;
    }

    public static int countPositiveNumbers(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                count++;
            }
        }
        return count;
    }

}


