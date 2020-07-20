package Udemy.AbstarctDataType;

public class Counter
{
	private String name = null;
	private int value = 0;
	
	public Counter(String s)
	{
		this.name = s;
	}
	
	public void increment()
	{
		this.value++;
	}
	
	public int getCurrentValue()
	{
		return this.value;
	}
	
	public String toString()
	{
		return name +" : "+value;
	}
}
