package Java_Programs;

import java.util.Arrays;

public class SecondLargestNumber {
	public static void main(String[] args) {
		int[] arrayObject = { 12, 35, 1, 10, 34, 1 };
		int n = arrayObject.length;
		print2LargestNumber(arrayObject,n);
		thirdNumber(arrayObject, n);
	}

	public static void print2LargestNumber(int[] input, int arraySize) {
		if (arraySize < 2) {
			System.out.println("Invalid Input");
			return;
		}
		Arrays.sort(input);
		for(int i = arraySize-2; i>=0; i--) {
			if (input[i] != input[arraySize - 1])
			{
				System.err.println("The Second Largest Number:"+input[i]);
				return;
			}
		}
		
		System.out.println("There is no second largest number");
	}
	
	public static void thirdNumber(int[] array, int arraySize)
	{
		if(arraySize<3)
		{
			System.out.println("Invalid Input");
			return;
		}
		
		Arrays.sort(array);
		for(int i=arraySize-3; i>=0; i--)
		{
			if(array[i]!=array[arraySize-1])
			{
				System.out.println("Third Largest Number: "+array[i]);
				return;
			}
		}
		System.out.println("No Third Largest Number");
	}
}
