package com.string.occurence.count;

public class StringOccurenceCount {

	public static void main(String[] args) {
		String str="amarjeet kumar singh";
		//char ch='s';//you can also write this 
		int count=0;
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='e')
			{
				count++;
			}
		}
		System.out.println("Total number of Occurence of character is:"+count);

	}

}
