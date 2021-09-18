package com.challenges.IF_ELSE;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int a = sc.nextInt();
        EvenorOD(a);
    }
    static void EvenorOD(int num1){
        if (num1%2 == 0) {
            System.out.println("The number is Even");
        }
        else {
            System.out.println("The number IS odd");
        }

    }
}
