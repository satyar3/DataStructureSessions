package Udemy.AbstarctDataType;

public class App
{
	public static void main(String[] args)
	{
		Counter counter = new Counter("Hello");
		counter.increment();
		counter.increment();
		counter.increment();
		
		System.out.println(counter.getCurrentValue());
		
		System.out.println(counter.toString());
	}
}
