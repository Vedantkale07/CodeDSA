package com.leedcodeQuestions;

import java.util.HashSet;

// return true if array has duplicate values
// otherwise return false

public class ContainDuplicate {
    public static void main(String[] args) {

        int [] arr= {2,4,5,6,2};

        boolean ans= containDuplicate(arr);
        System.out.println(ans);
    }

    public static boolean containDuplicate(int [] arr){

        HashSet<Integer> number= new HashSet<>();

        for(int num: arr){

            if(number.contains(num)){
                return true;
            }
            number.add(num);
        }
        return false;
    }
}
