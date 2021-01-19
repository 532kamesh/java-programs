package com.ploymorphism;

public class RuntimPoly
{
	double getIntrest(double intrest)
	{
		return intrest;
	}
	
	
}
class Sbi extends RuntimPoly
{
	double getIntrest(double intrest)
	{
		return intrest;
	}
}
class Icic extends RuntimPoly
{
	double getIntrest(double intrest)
	{
		return intrest;
	}
}
class Main
{
	public static void main(String[] args) {
		RuntimPoly rp=new Icic();
		rp.getIntrest(7.0);
		rp.getIntrest(6.0);
		
	}
}

