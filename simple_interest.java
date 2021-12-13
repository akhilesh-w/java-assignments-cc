package com.akhilesh;

import java.util.Scanner;

public class simple_interest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the principle amount : ");
        int p = in.nextInt();

        System.out.println("Enter the rate of interest : ");
        int r = in.nextInt();

        System.out.println("Enter the time period : ");
        int t = in.nextInt();

        int si = (p * r * t) / 100;
        System.out.println("simple interest = " + si);
    }
}
