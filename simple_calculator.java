package com.akhilesh;

import java.util.Objects;
import java.util.Scanner;

public class simple_calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int a = in.nextInt();

        System.out.print("Enter the second number : ");
        int b = in.nextInt();

        System.out.print("Enter the operator : ");
        String op = in.next();

        if (Objects.equals(op, "+")){
            System.out.println(a + b);
        } else if (Objects.equals(op, "-")) {
            System.out.println(a - b);
        } else if (Objects.equals(op, "*")) {
            System.out.println(a * b);
        } else if (Objects.equals(op, "/")) {
            System.out.println(a / b);
        }
    }
}
