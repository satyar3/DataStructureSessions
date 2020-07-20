package Udemy.Algorithims.HashTable;

public class Runner
{
	public static void main(String[] args)
	{
		HashTable table = new HashTable(9);
		
		System.out.println(table.find("test"));
		
		table.insertData("test");
		
		System.out.println(table.find("test"));
		System.out.println(table.find("hello"));
	}
}
