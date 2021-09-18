package com.challenges.Loops;

import java.util.Scanner;

public class PowerwithoutUSing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int a= sc.nextInt();
        System.out.println("enter the power");
        int b= sc.nextInt();
        power(a,b);

    }
    static void power(int num1, int num2){
        int ans =1;
       while (num2!=0){
           ans*=num1;
           --num2;
       }
        System.out.println(ans);
        

    }


}
