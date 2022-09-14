package com.bridgelabz;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        double a = sc.nextDouble();
        System.out.println("Enter the value of b : ");
        double b = sc.nextDouble();
        System.out.println("Enter the value of c : ");
        double c = sc.nextDouble();
        double firstroot, secondroot;
        double delta = b*b-4*a*c;
        if(delta >0){
            firstroot = (-b + Math.sqrt(delta)) / (2 * a);
            secondroot = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.format(
                    "First Root = %.2f and Second Root = %.2f",
                    firstroot, secondroot);
        }

        // check if delta is equal to 0
        else if (delta == 0) {

            // two real and equal roots
            // delta is equal to 0
            // so -b + 0 == -b
            firstroot = secondroot = -b / (2 * a);

            System.out.format(
                    "First Root = Second Root = %.2f;",
                    firstroot);
        }

        // if delta is less than zero
        else {

            // roots are complex number and distinct
            double real = -b / (2 * a);

            double imaginary = Math.sqrt(-delta) / (2 * a);

            System.out.printf("First Root = %.2f+%.2fi",
                    real, imaginary);
            System.out.printf("\nSecond Root = %.2f-%.2fi",
                    real, imaginary);
        }
    }
}

