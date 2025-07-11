package com.leedcodeQuestions;


public class PeackIndexMountainArray {
    static int indexMountainArray(int arr[])
    {
        int start=0;
        int end=arr.length-1;

        while(start<end){

            int mid=start+(end-start)/2;

            if(arr[mid]>arr[mid+1])
            {
                // you are in descending part of array
                //this may be an answer but look at left
                // this why end !=mid -1
                end=mid;

            }
            else{
                //you are in ascending part of  array

                start= mid +1;   // because we know that mid+1 element > mid element

            }
        }
        // in the end start== end and pointing to the largest number in the array
        // start and end always try to find max element in the above 2 checks
        // hence when they are pointing to just one  element , that the max ele because that is what checks say

        return start;   // or return end ,because both are equal
    }
    public static void main(String[] args) {

        int nums[]={0,1,3,5,7,6,9,10};
        System.out.println("this is the peack index of the array !!");
        System.out.println(indexMountainArray(nums));
    }
}
