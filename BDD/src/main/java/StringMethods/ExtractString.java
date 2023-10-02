package StringMethods;

public class ExtractString {

	public static void main(String[] args) {
		String name = "a100b9hdgh11";
		extractNumbers(name);
		extractcharacters(name);
	}
	
	public static void extractcharacters(String input)
	{
		System.out.println(input.replaceAll("[0-9]", ""));
	}
	
	public static void extractNumbers(String input)
	{
		System.out.println(input.replaceAll("[^0-9]", ""));
	}
}
