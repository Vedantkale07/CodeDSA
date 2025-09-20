package com.leedcodeQuestions;

public class LinearSearchProgram {

    public static void main(String[] args) {

        int arr [] = { 44,22,1,42,63,22,21,26,32};
        int ans= linearSearch(arr, 21);
        System.out.println(ans);

    }

    // search in array : return the index if item is found
    // otherwise item not found return -1
    public static int linearSearch(int [] arr, int target){

        if(arr.length==0){
            return -1;
        }

        for(int i=0; i< arr.length; i++){

            int element= arr[i];
            if(element== target){
                return i;
            }
        }

        // this line execute if non of above state ment is executed
        // hence the target is not found
        return -1;
    }
}
