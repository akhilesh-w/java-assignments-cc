package com.akhilesh;

import java.util.Scanner;

public class multiplication_table {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();

        for (int i = 1; i < 11; i++) {
            int mul = i * a;
            System.out.println(mul);
        }
    }
}
