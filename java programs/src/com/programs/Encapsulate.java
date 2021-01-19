package com.programs;

class Encapsulate {
	private int age=25;
	private String name="kamesh";
	private String data ="hjk";
	
	public int getAge()
	{
		return age;
		
	}
//	public void setAge(int newage)
//	{
//		this.age=newage;
//	}
	public String getName()
	{
		return name;
	}
//	public void setName(String newName)
//	{
//		this.name=newName;
//	
//	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulate e=new Encapsulate();
		//e.setName("Kamesh");
		//e.setAge(25);
		System.out.println("My name is: "+e.getName()+ " and my age is: "+e.getAge());  
		

	}

}
