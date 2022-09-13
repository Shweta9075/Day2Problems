package com.bridgelabz;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = 231;
        int rev = 0;
        int rem;

        while(n != 0) {
            rem = n%10;
            rev = rev*10+rem;
            n = n/10;
        }
        System.out.println("Reverse of given number is : " + rev);

    }
}
