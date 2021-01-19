package com.programs;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=s.nextInt();
		int fact=1;
		for(int i=1;i<=4;i++)
		{
			fact=fact*i;
			System.out.println(fact);
		}
		

	}

}
