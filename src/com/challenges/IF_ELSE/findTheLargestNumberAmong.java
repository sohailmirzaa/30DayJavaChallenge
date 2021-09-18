package com.challenges.IF_ELSE;

import java.util.Scanner;

public class findTheLargestNumberAmong {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        int c= sc.nextInt();
        //int max;
        Maximum(a,b,c);
    }
    static int Maximum(int num1, int num2, int num3){
       int max=Math.max(num1,num2);
        if (max!=0) {
            if (max>num3){
                System.out.println(max);
            }
            else {
                System.out.println(num3);
            }
            return num3;

        }
        return max;

    }
}
