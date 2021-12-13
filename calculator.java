package com.akhilesh;

import java.util.Objects;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the operator : ");
        String operator = in.next();

        System.out.println("Enter the number ");
        int num1 = in.nextInt();

        System.out.println("Enter the second number ");
        int num2 = in.nextInt();

        if (Objects.equals(operator, "+"))
            System.out.println("The sum of two numbers is " + (num1 + num2));
        else if (Objects.equals(operator, "-"))
            System.out.println("The difference between two numbers is " + (num1 - num2));
        else if (Objects.equals(operator, "*"))
            System.out.println("The multiplication of two numbers is " + (num1 * num2));
        else if (Objects.equals(operator, "/"))
            System.out.println("The division of two numbers is " + (num1 / num2));
        else if (Objects.equals(operator, "%"))
            System.out.println("The remainder is " + (num1 + num2));
        else
            System.out.println("The operator you entered is not an appropriate operator ");

    }
} 
