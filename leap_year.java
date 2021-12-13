package com.akhilesh;

import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the year : ");
        int year = in.nextInt();

        if (year % 400 == 0) {
            System.out.println("This is a leap year ");
        } else if (year % 100 == 0) {
            System.out.println("This is not a leap year ");
        } else if (year % 4 == 0) {
            System.out.println("This is a leap year ");
        } else {
            System.out.println("This is not a leap year ");
        }
    }
}
