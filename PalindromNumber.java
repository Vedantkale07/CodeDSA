package com.leedcodeQuestions;

public class PalindromNumber {

    public static void main(String[] args) {
//        System.out.println(palindrom(121));

        System.out.println(palindrom(121));
    }

    public static boolean palindrom(int n){
        int og=n;
            int rev=0;
        while(n>0){
            int digit= n%10;
            rev= rev *10 + digit;
            n= n/10;


        }

       return og == rev;

    }
}
