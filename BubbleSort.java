package com.sortingAlgorithm;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args)
    {
        int arr[]={6,2,8,1,4,3,5};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }

    public static int[] bubbleSort(int []arr){

        int temp=0;
        int n=arr.length;
       for(int i=0; i<n;i++){

           for (int j = 1; j <n-i; j++) {

               if(arr[j] < arr[j-1]){
                   temp=arr[j-1];
                   arr[j-1]=arr[j];
                   arr[j]=temp;
               }
           }
       }
       return arr;
    }
}
