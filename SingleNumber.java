package com.leedcodeQuestions;

public class SingleNumber {

    public static void main(String[] args) {

        int [] nums={1,1,3,3,4,5,5};
        System.out.println("this is the single no of the array:");
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int nums[]){
        int no=0;
        for (int i = 0; i < nums.length; i++) {


            no=no^nums[i];

        }
        return  no;
    }
}
