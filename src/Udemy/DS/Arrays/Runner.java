package Udemy.DS.Arrays;

public class Runner
{
	public static void main(String[] args) throws Exception
	{
		Array arr = new Array(3);
		arr.print();
		
		arr.insert(2);
		arr.insert(3);
		arr.insert(4);
		//arr.print();
		arr.insert(5);
		//arr.print();
		arr.deleteAt(2);
		arr.print();
		arr.indexOf(4);
		
	}
}
