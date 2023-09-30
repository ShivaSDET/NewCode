package Java_Programs;

import java.util.HashMap;
import java.util.Map;

public class characterOccurence {

	public static void main(String[] args) {
		String name = "shishivava";
		charOccurence(name);
	}

	public static void charOccurence(String input)
	{
		char[] arrayObject = input.toCharArray();
		HashMap<Character, Integer> mapObject = new HashMap<Character, Integer>();
		for(char value: arrayObject)
		{
			if(mapObject.containsKey(value))
			{
				mapObject.put(value, mapObject.get(value)+1);
			}else
			{
				
				mapObject.put(value, 1);
			}
		}
		
		for(Map.Entry<Character, Integer> entryList: mapObject.entrySet())
		{
			System.out.println(entryList.getKey()+" "+entryList.getValue());
		}
	}
}
