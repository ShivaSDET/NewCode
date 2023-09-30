package Java_Programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ReverseString {
	public static void main(String[] args)
	{
		String name="Textme";
		reverseLoopWithCharArray(name);
		reverseLoopWithString(name);
		reverseWithStringBuilder(name);
		reverseStringWithStringBuffer(name);
		reverseStringWithCollection(name);
	}
	
	
	//Reverse loop with Character Array
	public static void reverseLoopWithCharArray(String input)
	{
		char[] arrayObject = input.toCharArray();
		for(int i=arrayObject.length-1; i>=0; i--)
		{
			System.out.print(arrayObject[i]);
		}
		System.out.println("");
	}
	
	public static void reverseLoopWithString(String input)
	{
		for(int i=input.length()-1; i>=0; i--)
		{
			System.out.print(input.charAt(i));
		}
		System.out.println("");
	}
	
	public static void reverseWithStringBuilder(String input)
	{
		StringBuilder builder = new StringBuilder(input);
		builder = builder.reverse();
		System.out.println("String Builder: "+builder);
	}
	
	public static void reverseStringWithStringBuffer(String input)
	{
		StringBuffer buffer = new StringBuffer(input);
		buffer = buffer.reverse();
		System.out.println("String Buffer: "+buffer);
	}
	
	public static void reverseStringWithCollection(String input)
	{
		char[] arrayObject = input.toCharArray();
		List<Character> listObject = new ArrayList<Character>();
		for(char value: arrayObject)
		{
			listObject.add(value);
		}
		
		Collections.reverse(listObject);
		Iterator<Character> itr = listObject.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next());
		}
	}
}
