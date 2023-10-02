package Java_Programs;

public class extractNumbersAndAdd {
	public static void main(String[] args) {
		String name="a109b9hdgh11";
		System.out.println(sumDigitsFromString(name));
		System.out.println(sumValues(name));
	}
	
	public static int sumDigitsFromString(String input)
	{
		int sum = 0;
		for(int i =0; i<input.length(); i++)
		{
			char occurence = input.charAt(i);
			if(Character.isDigit(occurence))
			{
				sum +=Integer.parseInt(String.valueOf(occurence));
			}
			
		}
		return sum;
	}
	
	public static int sumValues(String input)
	{
		int sum = 0;
		for(int i=0; i<input.length(); i++)
		{
			char currentChar = input.charAt(i);
			if(Character.isDigit(currentChar))
			{
				sum += Integer.parseInt(String.valueOf(currentChar));
			}
		}
		return sum;
	}
}
