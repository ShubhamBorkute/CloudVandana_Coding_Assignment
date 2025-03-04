package com.cloudvandana;

import java.util.HashMap;
import java.util.Map;

public class AnagramString {
	
	public static boolean isAnagramString(String str1, String str2) {
		
		//base case
		if(str1.length()!= str2.length())return false;
		
		
		
		
		
		Map<Character, Integer> charCount=new HashMap<>();
	// if case issue str1.toLowercase().toCharArray()
		for(char c: str1.toCharArray()) {
			charCount.put(c, charCount.getOrDefault(c, 0)+1);
		}
  // if case issue str2.toLowercase().toCharArray()
		for(char c :str2.toCharArray()) {
			if(!charCount.containsKey(c)|| charCount.get(c)==0) {
				return false;
			}
			charCount.put(c, charCount.get(c)-1);
		}
		
		return true;
	}
	
	
	
	
	public static void main(String[] args) {
		if(isAnagramString("silent","listen")) {
			System.out.println("Anagram String");
		}else {
			System.out.println("Not Anagram String");
		}
		
		//OR Ternary Operation
		//System.out.println(isAnagramString("silent", "listen")?"Anagram":"Not Anagaram");
	}
	
	

}
