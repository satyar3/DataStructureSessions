package Udemy.Algorithims.Recursion;

public class ReduceByOne
{
	public static void main(String[] args)
	{
		reduce(5);
	}
	
	static void reduce(int n){
		if(n>1)					//Base Condition
			reduce(n-1);
		
		System.out.println(n);
	}
}
