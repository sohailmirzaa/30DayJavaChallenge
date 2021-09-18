package com.challenges.Loops;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number=sc.nextInt();
        int number1= 0;
        int number2= 1;
        fibonacciSeries(number,number1,number2);
    }
    static void fibonacciSeries(int series, int num1, int num2){
        System.out.print(num1);
        for (int i = 1; i <=series ; i++) {

            int fibo=num1+num2;

            System.out.print(","+num2);
            num1=num2;
            num2=fibo;

        }
    }
}
