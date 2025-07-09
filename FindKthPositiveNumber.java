package com.leedcodeQuestions;

// used bubble sort for less space complexity
// find kth positive missing number


public class FindKthPositiveNumber {

    public static void main(String[] args) {

        int [] arr={1,2,3,4,5,7,9};
        int k=2;
        System.out.println(findKthPositiveNumber(arr,k));

    }

    public static int findKthPositiveNumber(int [] arr, int k){
        int start=0;
        int end=arr.length;
        while(start < end){
            int mid= (start + end)/2;
            int no= (arr[mid]-mid-1);
            if(no < k){     //element is less than k no present at left side
                start= mid+1;        //
            }else {
                end=mid;
            }
        }
        return end+k;  // return the missing positive number
    }
}
