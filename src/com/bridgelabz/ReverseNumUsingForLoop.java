package com.bridgelabz;

public class ReverseNumUsingForLoop {
    public static void main(String[] args) {
        int n = 231;
        int rev = 0;
        int rem;

        for (int i = 0; i <= n; i++) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        System.out.println("The reverse of given number is : " + rev);

    }
}
