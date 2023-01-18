package com.GitDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class ArraylistDemo {

	public static void main(String[] args) {
		String str="Hello i love java";
		char[] ch=str.toCharArray();
		Set<Character> set=new HashSet<Character>();
		Set<Character> duplicate = new LinkedHashSet<Character>();
		for(char c:ch)
		{
			if(!set.add(c) && c!=' ') {
				duplicate.add(c);
			}
		}
		System.out.println(duplicate);
	}

}
