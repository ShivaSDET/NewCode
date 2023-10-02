/*Extract sequence of digits from a String, 
 * but instead of adding individual digits together, 
 * you want to consider sequence of digits as whole numbers and then sum them up*/
package Java_Programs;

public class extractSequenceofDigitsAndSum {

	public static void main(String[] args) {
		String name="a100b9hdgh11";
		System.out.println(sumSequence(name));
	}
	
	public static int sumSequence(String input)
	{
		int sum = 0;
		int currentNumber = 0;
		for(int i=0; i<input.length(); i++)
		{
			char currentChar = input.charAt(i);
			if(Character.isDigit(currentChar))
			{
				currentNumber = currentNumber * 10+ (currentChar - '0');
				if(i== input.length()-1 || !Character.isDigit(input.charAt(i+1)))
				{
					sum +=currentNumber;
					currentNumber = 0;
				}
			}
				
		}
		return sum;
	}
}