package com.challenges.IF_ELSE;

import java.util.Scanner;

public class CheckWhetherItsVowelOrConsonant {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       char ch1= sc.next().charAt(0);
       checkVowels(ch1);
    }
    static boolean checkVowels(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
            System.out.println("its a vowel");
        }
        else
        {
            System.out.println("its a consonant");
        }
               return false;
        }
    }


