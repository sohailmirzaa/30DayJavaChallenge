package com.challenges.Basics;

import java.util.Scanner;

public class AdditionOfTwoIntegersEnteredByTheUser {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(addition(a,b));

    }

    static int addition(int num1, int num2){
        int sum = num1+num2;
        return sum;
    }
}
