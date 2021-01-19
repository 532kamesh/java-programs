package com.programs;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);

System.out.println("Enter the a value: ");
int a=s.nextInt();
System.out.println("Enter the b value: ");
int b=s.nextInt();
a=a+b;
b=a-b;
a=a-b;
System.out.println("value of a : " + a +" b value :"+ b );
	}

}
