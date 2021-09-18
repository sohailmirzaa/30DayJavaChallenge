package com.challenges.Loops;

import java.util.Scanner;


public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(CheckPrimeOrNot(a));


    }

    static boolean CheckPrimeOrNot(int num) {
        if (num > 1) {
            for (int i = 1; i <= num; i++) {
                if (num % 2 == 0) {
                    return false;
                } else {
                    return true;
                }
            }
        }
        return CheckPrimeOrNot(num);


    }
}

