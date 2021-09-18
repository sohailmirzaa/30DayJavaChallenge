package com.challenges.IF_ELSE;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data= sc.nextInt();

        LeapYearCheck(data);

    }

    static boolean LeapYearCheck(int year){

        if(year%4!=0 && year%100!=0 && year%400!=0 ){
            System.out.println("its not a leap year");
        }

        else
        {
            System.out.println("its a leap year");
        }
        return false;
    }

}
