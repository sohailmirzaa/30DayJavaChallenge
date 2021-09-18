package com.challenges.Loops;

import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        factorial(number);

    }
    static int factorial(int num){
        int fact=1;
        for (int i = 1; i <=num; i++) {
            fact= fact*i;
        }
        System.out.println(fact);
        return fact;
    }


}
