package Certification;

public class OverloadedMethods {
	
	double calcAverage(double marks1, int marks2)
	{
		return (marks1+marks2)/2.0;
	}
	
	double calcAverage(int marks1, double marks2)
	{
		return (marks1+marks2)/2.0;
	}
	
	public static void main(String[] args)
	{
		OverloadedMethods ob = new OverloadedMethods();
	//	ob.calcAverage(2, 3);
	}
}
