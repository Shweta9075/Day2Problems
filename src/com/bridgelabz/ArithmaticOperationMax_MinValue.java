package com.bridgelabz;

import java.util.Scanner;

public class ArithmaticOperationMax_MinValue {
    public static void main(String[] args) {
        int max, min;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number : ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number : ");
        int b = sc.nextInt();
        System.out.println("Enter 3rd number : ");
        int c = sc.nextInt();
        int num1 = a+b*c;
        int num2 = a+c/b;
        int num3 = a%b/c;
        int num4 = a*b+c;
        System.out.println("1st arithmetic operation is : " + num1);
        System.out.println("2nd arithmetic operation is : " + num2);
        System.out.println("3rd arithmetic operation is : " + num3);
        System.out.println("4th arithmetic operation is : " + num4);
        max = (num1>num2 && num1>num3 && num1>num4)?
                num1:((num2>num3 && num2>num4))?
                num2:((num3>num4 ? num3:num4));
        System.out.println("Maximum number is : " + max);
        min = (num1<num2 && num1<num3 && num1<num4)?
                num1:((num2<num3 && num2<num4))?
                num2:((num3<num4 ? num3:num4));
        System.out.println("Minimum number is : " + min);

    }
}
