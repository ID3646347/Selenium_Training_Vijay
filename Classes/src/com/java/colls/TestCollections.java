package com.java.colls;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.*;

import com.java.Duck;

public class TestCollections {

	public static void main(String[] args) throws FileNotFoundException {
		List<String> list = new ArrayList<>();
		list.add("Amal");
		list.add("Kumar");
		list.add("Raj");
		list.add("Amal");
		
//		Iterator<String> iterator = list.iterator();
//		while(iterator.hasNext())
//			System.out.println(iterator.next());
		
//		Map<String,String> map = new HashMap<>();
//		map.put( "Amal", "50L");
//		map.put("Kumar", "90L");
//		map.put("Raj", "1.2C");
//		map.put("Amal", "1.5C");
//		System.out.println(map.get("Amal"));
//		for(int i=0;i<map.size();i++)
//			System.out.println(i + " " + map.get(i));
	
		System.out.println("****List****");
		try{
		for(int i=0;i<=list.size();i++){
			list.set(i, "Mr. "+list.get(i));
			System.out.println(list.get(i));
		}
		}catch(IndexOutOfBoundsException e){
			//e.printStackTrace();
			System.out.println("Array Index might be out of bounds");
		}catch(Exception e){
						
		}
		
		new FileOutputStream("");
//		
//		
//		System.out.println(list);
//	
//		System.out.println("\n****Set****");
//		Set<String> set = new TreeSet<>();
//		set.add("Raj");
//		set.add("Amal");
//		set.add("Kumar");
//		set.add("Amal");
//		
//		for(String name:set)
//			System.out.println(name);
	}
}
