package com.challenges.Basics;

import java.util.Scanner;

public class DivisonProblem {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(division(a,b));


    }

    static double division (int number1,int number2){
        int divide= number1/number2;
        return divide;
    }
}
