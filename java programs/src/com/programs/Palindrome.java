package com.programs;

import java.util.Scanner;


public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String rev="";
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string :");
		String str =s.nextLine();
		int len=str.length();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
			
		}
		if(str.equals(rev))
		{
			System.out.println("Enter string is palindrome " +rev);
		}
		else
			System.out.println("String is not palindrome ");
		
		

	}

}
