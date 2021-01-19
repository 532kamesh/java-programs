package com.programs;

import java.util.Scanner;

public class Fibbo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t=0;
		int n1=1;
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value: " );
		int num=s.nextInt();
		System.out.println(t+ +n1);
		for(int i=0;i<=num;i++)
		{
		int n3=t+n1;
		System.out.println(n3);
		t=n1;
		n1=n3;
		}
	}

}
