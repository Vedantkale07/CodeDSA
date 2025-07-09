package com.leedcodeQuestions;

import java.util.Arrays;

public class CommanPrefixString {

    public static void main(String [] args){


        String [] strs ={"flower","flow","flight"};

        System.out.println("this is the common prefix of the given array:");
        System.out.println(commonPrefix(strs));

    }

    public static String commonPrefix(String [] strs){

        StringBuilder result= new StringBuilder();

        Arrays.sort(strs);
//        System.out.println("sorted array!!!\n"+strs);
        char [] first= strs[0].toCharArray();
        char [] last= strs[strs.length-1].toCharArray();

        for (int i = 0; i <first.length ; i++) {
            if(first[i] != last[i]){
                break;
            }
            result.append(first[i]);

        }
        return result.toString();
    }
}
