package com.bridgelabz;

public class SumOf_N_NaturalNumber {
    public static void main(String[] args) {

        int n = 5;
        int sum = 0;

        int i = 1;
        while (i <= n) {
            sum = sum + i;
            i++;
        }
        System.out.println("Sum of N natural no is : " + sum);
    }

}
