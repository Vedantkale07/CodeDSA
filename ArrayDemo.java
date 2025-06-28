package com.arrayProgram;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int n=sc.nextInt();
		String [] str= new String [5];
		
		System.out.println("enter array elements:");
		for (int i = 0; i < str.length; i++)
		{
			str[i]=sc.next();		
		}
		System.out.println("display array elements:");
		for (int i = 0; i < str.length; i++)
		{
			System.out.print(str[i]+" ");
		}
		System.out.println("\nconverted into Array to String");
		System.out.println(Arrays.toString(str));
		
		sc.close();
		
	}
}
