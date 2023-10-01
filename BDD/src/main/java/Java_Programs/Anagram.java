package Java_Programs;
import java.util.HashMap;
import java.util.Map;

public class Anagram {
	
	public static void main(String[] args)
	{
		String S1 = "maeam";
		String S2 = "madam";
		isAnagram(S1,S2);
	}
	
	public static void isAnagram(String name, String surname)
	{
		if(name.length()!=surname.length())
		{
			System.out.println("Both Strings length is not equal");
			return;
		}
		
		char[] nameObject = name.toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(char value: nameObject)
		{
			if(map.containsKey(value))
			{
				map.put(value,map.get(value)+1);
			}else
			{
				map.put(value, 1);
			}
		}
		
		char[] surnameObject = surname.toCharArray();
		for(char value: surnameObject)
		{
			if(map.containsKey(value))
			{
				map.put(value, map.get(value)-1);
			}
		}
		
		for(Map.Entry<Character, Integer>entries: map.entrySet())
		{
			if(map.get(entries.getKey())>=1)
			{
				System.out.println("Given input is not Anagram");
				return;
				
			}
		}
		System.out.println("Given input is Anagram");
	}
}
