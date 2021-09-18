package com.challenges.Basics;

import java.util.Scanner;

public class ProgramToMultipyDecimalNumbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        double a= sc.nextDouble();
        double b= sc.nextDouble();
        System.out.println(Multipy(a,b));
    }

    static  double Multipy( double num1, double num2){
          double multi= num1*num2;

          return multi;
    }
}
