package com.challenges.Loops;

import java.util.Scanner;

public class PowerOfTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int a= sc.nextInt();
        System.out.println("enter the power");
        int b= sc.nextInt();
        System.out.println(Math.pow(a,b));
    }

}
