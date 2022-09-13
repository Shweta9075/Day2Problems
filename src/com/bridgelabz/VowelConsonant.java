package com.bridgelabz;

import java.util.Scanner;

public class VowelConsonant {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character : ");
        char c=sc.next( ).charAt(0);
        char z = Character.toUpperCase(c);
        switch (z){
            case 'A' :
            case 'E' :
            case 'I' :
            case 'O' :
            case 'U' :
                System.out.println(c + " is vowel.");
                break;

            default:
                System.out.println(c + " is consonant");

        }

    }
}
