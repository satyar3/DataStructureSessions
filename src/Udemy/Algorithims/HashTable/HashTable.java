package Udemy.Algorithims.HashTable;

public class HashTable
{
	String[] hashArray;
	int arraySize;
	int size = 0;
	
	public HashTable(int numberOfSlots)
	{
		if(isPrime(numberOfSlots))
		{
			hashArray = new String[numberOfSlots];
			arraySize = numberOfSlots;
		}
		else
		{
			int nextPrimeNumber = getNextPrime(numberOfSlots);
			hashArray = new String[nextPrimeNumber];
			arraySize = nextPrimeNumber;
			
			System.out.println("Number of slots updated to :: "+nextPrimeNumber);
		}
	}
	
	private boolean isPrime(int numberOfSlots)
	{
		int counter = 0;
		for(int i=1;i<=numberOfSlots;i++)
		{
			if(numberOfSlots%i == 0)
				counter++;
		}
		
		if(counter>2)
			return false;
		else
			return true;
	}
	
	private int getNextPrime(int numberOfSlots)
	{
		while(!isPrime(numberOfSlots))
		{
			numberOfSlots++;
		}
		
		return numberOfSlots;
	}
	
	//Return preferred position
	private int hashFunction(String word)
	{
		int hashVal = word.hashCode();
		hashVal = hashVal % arraySize;
		
		if(hashVal < 0)
			hashVal+=arraySize;
		
		return hashVal;
	}
	
	//Return StepSize greater tahn 0
	private int hashFunctionStep(String word)
	{
		int hashVal = word.hashCode();
		hashVal = hashVal % arraySize;
		
		if(hashVal < 0)
			hashVal+=arraySize;
		
		//Any prime number smaller than the array size
		return 3 - hashVal%3;
	}
	
	//insert data
	public void insertData(String word)
	{
		int hashVal = hashFunction(word);
		int stepSize = hashFunctionStep(word);
		
		while(hashArray[hashVal] != null)
		{
			hashVal+= stepSize;
			hashVal%= arraySize;
		}
		
		hashArray[hashVal] = word;
		size++;
	}
	
	public String find(String word)
	{
		int hashVal = hashFunction(word);
		int stepSize = hashFunctionStep(word);
		
		while(hashArray[hashVal] != null)
		{
			if(hashArray[hashVal].equals(word))
			{
				return hashArray[hashVal];
			}
			
			hashVal+= stepSize;
			hashVal%= arraySize;
		}
		
		return hashArray[hashVal]; 
	}
	
}
