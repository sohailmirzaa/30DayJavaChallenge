package com.challenges.Loops;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        int number = sc.nextInt();
        multiplication(number);
    }

    static void multiplication(int num){
        int multi=num;
        for (int i =1; i <=10 ; i++) {
                System.out.println(multi+"x"+i+"="+ multi*i);
            }
        }
    }




