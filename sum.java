package com.akhilesh;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number : ");
        int num1 = in.nextInt();

        System.out.print("Input second number ");
        int num2 = in.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum of two numbers is " + sum);
    }
}
