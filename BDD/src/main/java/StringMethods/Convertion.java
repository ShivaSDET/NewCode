package StringMethods;

public class Convertion {
	public static void main(String[] args)
	{
		String name = "42342";
		char[] arrayObject = name.toCharArray();
		for(int i=0; i<arrayObject.length; i++)
		{
			String number = String.valueOf(arrayObject[i]);
			int number2 = Integer.parseInt(number);
			//wSystem.out.println(number);
			System.out.println(number2);
			//System.out.println(arrayObject[i]);
		}
	}
}
