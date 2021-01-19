package com.programs;

import java.util.HashMap;
import java.util.Map;

public class DuplcateInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Hello guru";
Integer count = null;
char[] ch=str.toCharArray();
Map<Character, Integer> chmap=new HashMap<>();
for(Character c:ch)
{
	if(chmap.containsKey(c))
	{
		count=chmap.put(c, chmap.get(c)+1);
	}
	else
	{
		chmap.put(c, 1);
	}
	
	
}
for (Map.Entry<Character, Integer> entry : 
    chmap.entrySet()) { 

   if (entry.getValue() > 1) { 
       System.out.println(entry.getKey() 
                          + " : "
                          + entry.getValue()); 
   } 
} 


	}

}
