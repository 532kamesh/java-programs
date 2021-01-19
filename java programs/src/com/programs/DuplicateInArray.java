package com.programs;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateInArray 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
 String str[]= {"java","c","java","phy"};
 Scanner s=new Scanner(System.in);
 System.out.println("Enter the value in array");
 
 	Set<String> store =new HashSet<String>();
 	for(String str1:str)
 	{
 		if(store.add(str1)==false)
 		{
 			System.out.println("duplicate element is : "+str1);
 		}
 		
 	}
// 	for(int i=0;i<str.length();i++)
// 	{
// 	//String char=str.charAt(i); 
// 	if(store.add(str)==false)
// 	{
// 		System.out.println(str);
// 	}
// 	}
 
 	}

}
