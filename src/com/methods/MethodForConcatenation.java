package com.methods;

public class MethodForConcatenation {
    public static void main(String[] args) {
        int numInteger = 5;
        double numDouble = -2.7;
        String str = "I'm a string! I have ";
        System.out.println(concatAndSum(str, numInteger, numDouble));
    }

    public static String concatAndSum(String s, int a, double b) {
        double sum = a + b;
        return s + sum;
    }
}
