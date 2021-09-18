package com.challenges.Loops;

import java.util.Scanner;

public class ReverseAGivenNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  a =sc.nextInt();

        ReverseNumber(a);
    }
    static  void ReverseNumber(int num){
        while (num!=0){
            int reverse=0;
            int remainder= num%10;
            reverse = reverse*10+remainder;
            num=num/10;
            System.out.print(reverse);

        }

        }
    }


