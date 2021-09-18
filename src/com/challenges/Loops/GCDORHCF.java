package com.challenges.Loops;

import java.util.Scanner;

public class GCDORHCF {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1= sc.nextInt();
        int number2= sc.nextInt();

        System.out.println("GCD of " + number1 +" and " + number2 + " is " + GCD(number1,number2));
    }

    static  int GCD(int a, int b) {
        // Everything divides 0
        if (a == 0)
            return b;
        if (b == 0)
            return a;

        // base case
        if (a == b)
            return a;

        // a is greater
        if (a > b)
            return GCD(a-b, b);
        return GCD(a, b-a);
    }

}
