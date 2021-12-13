package com.akhilesh;

import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a = in.nextInt();

        if (a % 2 == 0){
            System.out.println("The given number is a even number ");
        } else {
            System.out.println("The given number is a odd number ");
        }
    }
}
