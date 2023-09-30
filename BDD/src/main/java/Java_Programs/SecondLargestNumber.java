package Java_Programs;

public class SecondLargestNumber {
	public static void main(String[] args)
	{
		int[] arrayObject = {12,35,1,10,34,1};
		int n = arrayObject.length;
		print2largest(arrayObject, n);
		
	}
	
	public static void print2largests(int arr[], int arr_size)
	{
		int second;
		// There should be at least two elements
		if(arr_size<2)
		{
			System.out.println("Invalid Input");
			return;
		}
		
		int largest = second = Integer.MIN_VALUE;
		//Find the largest number
		for(int i = 0; i<arr_size; i++)
		{
			largest = Math.max(largest, arr[i]);
		}
		
		for(int i =0; i<arr_size; i++)
		{
			if(arr[i]!=largest)
			{
				second = Math.max(second, arr[i]);
			}
		}
		
		if(second == Integer.MIN_VALUE)
			System.out.println("There is no second largest number");
		else
			System.out.println("The second largest number: "+second);
		
	}
	
	public static void print2largest(int arr[], int arr_size)
	{
		int second;
		// There should be at least two elements
		if(arr_size<2)
		{
			System.out.println("Invalid Input");
			return;
		}
		
		int largest = second = Integer.MIN_VALUE;
		//Find the largest number
		for(int i = 0; i<arr_size; i++)
		{
			largest = Math.max(largest, arr[i]);
			if(arr[i]!=largest)
			{
				second = Math.max(second, arr[i]);
			}
		}
		
		if(second == Integer.MIN_VALUE)
			System.out.println("There is no second largest number");
		else
			System.out.println("The second largest number: "+second);
		
	}
}
