package com.challenges.Loops;

import java.util.Scanner;

public class PalinDromeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if (ReverseNumber(a) == a) {
            System.out.println("the number is palindrome");
        } else {
            System.out.println("the number is not palindrome");
        }
    }

    static int ReverseNumber(int num) {
        int reverse = 0;
        while (num != 0) {
            int remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num = num / 10;


        }
        return reverse;


    }
}
