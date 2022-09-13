package com.bridgelabz;

public class CheckPalindromeNumber {
    public static void main(String[] args) {
        int n = 121;
        int temp = n;
        int rev = 0;
        int rem;

        while (temp != 0) {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        if (n == rev) {
            System.out.println(n + " is palindrome number");
        } else {
            System.out.println(n + " is not palindrome number");
        }

    }
}
