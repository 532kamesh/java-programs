package com.programs;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapsClassA {
	
	public static void main(String [] args) {
		
		Map<String,String> value = new HashMap<>();
		value.put("Name", "Raj");
		value.put("Country", "India");
		value.put(null, null);
		value.put("Null Value", null);
        		
		for(Map.Entry<String, String> en : value.entrySet()) {
			System.out.println(en.getKey()+" = "+en.getValue());
		}
		
	}	
}
