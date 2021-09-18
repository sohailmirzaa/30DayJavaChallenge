package com.challenges.Loops;

public class LCM extends GCDORHCF {
    public static void main(String[] args) {
     int a=20;
     int b=30;
        System.out.println(LCM(a,b));
    }
    static int LCM(int number1, int number2){
        int lcm=(number1*number2)/GCD(number1,number2);
        return lcm;
    }

}
