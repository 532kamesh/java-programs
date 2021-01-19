package com.testng;

public class MsgIgnore {
	private static String name = "kamesh";
	public static int sum;
	public MsgIgnore(String  name)
	{
		this.name=name;
		System.out.println("hello " +name);
	}
	public static  void message()
	{
		sum=1+1;
		System.out.println("Hello " +name + " you have " +sum+ " message");
		
	}

}
