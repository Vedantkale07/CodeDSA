package com.leedcodeQuestions;

public class EvenDigit {
    public static void main(String[] args) {
        int [] nums= { 2,11,42,2322,4,112};
        System.out.println(evenDigit(nums));


    }

    static int evenDigit(int nums []){

        int count=0;
        for(int number: nums){
            if(even(number)){
                count ++;
            }
        }
        return count;
    }

    static boolean even(int number){
        int numberOfDigit= digit(number);
        if(numberOfDigit %2== 0){
            return true;
        }
        return false;
    }
    static int digit(int number){

        //if number is negative make it positive
        if (number <0){
            return number *-1;
        }

        // if number is 0 it should be count
        if(number ==0){
            return 1;
        }
        int count =0;
        while(number >0){
            count ++;
            number /=10;
        }
        return count;
    }
}
