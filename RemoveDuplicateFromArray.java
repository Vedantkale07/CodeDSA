package com.leedcodeQuestions;

public class RemoveDuplicateFromArray {

    public static void main(String[] args) {

    }

    public static int removeDuplicate(int nums[]){
        int i=0;
        for(int n:nums){
            if(i<2 || n!= nums[i-2]){
                nums[i++]=n;
            }
        }
        return i;
    }
}
