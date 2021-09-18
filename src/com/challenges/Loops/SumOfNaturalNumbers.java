package com.challenges.Loops;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers= sc.nextInt();
        sumOfNaturalNumbers(numbers);

    }
    static void sumOfNaturalNumbers(int num){
        int sum=0;
        for ( int i = 1; i<=num; i++) {
          sum=sum+i;
        }
        System.out.println(sum);
    }
}
