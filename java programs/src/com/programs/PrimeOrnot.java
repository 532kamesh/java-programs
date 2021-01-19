package com.programs;

import java.util.Scanner;

public class PrimeOrnot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the num:  ");
		num=s.nextInt();
		//int m=num%2;
		if(num<=1)
		{
			System.out.println("nmber is not prime");
		}
		for(int i=2;i<num;i++)
		{
			if(num % i==0)
			{
				System.out.println("is not prime");
				break;
			}
			else
				System.out.println("is prime");
			
		}
		

	}

}
