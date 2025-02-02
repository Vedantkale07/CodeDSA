package com.leedcodeQuestions;

// used bubble sort for less space complexity

public class FindKthPositiveNumber {

    public static void main(String[] args) {

        int [] arr={2,3,4,7,11};
        int k=5;
        System.out.println(findKthPositiveNumber(arr,k));

    }

    public static int findKthPositiveNumber(int [] arr, int k){
        int start=0;
        int end=arr.length;
        while(start < end){
            int mid= (start + end)/2;
            if(arr[mid]-mid-1 < k){          //element is less than k no present at left side
                start= mid+1;        //
            }else {
                end=mid;
            }
        }
        return end+k;    // return the missing positive number
    }
}
