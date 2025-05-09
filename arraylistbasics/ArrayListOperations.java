package arraylistbasics;
import java.util.*;

public class ArrayListOperations 
{
	void addAndRetrieve()
	{
		ArrayList<String> list = new ArrayList<>();	
		list.add("Banana");
		list.add("Apple");
		list.add("Pomogranade");
		list.add("Mango");
		list.add("Musk Melon");
		
		System.out.println("third fruit is : " + list.get(2));
	}

	void iterateAndRemove()
	{
		ArrayList<Integer> list = new ArrayList<>();	
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		ListIterator<Integer> iterator = list.listIterator();
		
		while(iterator.hasNext())
		{
			Integer num = iterator.next();
			if(num > 30)
			{
				iterator.remove();
			}
		}
		
		System.out.println(list);
	}
	
	void searchElement()
	{
		ArrayList<Character> list = new ArrayList<>();
		
		for(int i = 0; i < 10; i++)
			list.add((char)(i+65));
		
		System.out.println(findIndex('C', list));
	}
	
	int findIndex(char c, ArrayList<Character> list)
	{
		for(int i = 0; i < list.size(); i++)
			if(list.get(i) == c)
				return i;
		
		return -1;
	}
	
	
	void arrayListSorting()
	{
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < 10; i++)
			list.add(new Random().nextInt(101));

		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
	
	
	void converting()
	{
		ArrayList<String> list = new ArrayList<>();	
		list.add("Banana");
		list.add("Apple");
		list.add("Pomogranade");
		list.add("Mango");
		list.add("Musk Melon");
		
		System.out.println("original array : " + list);
		String[] fruits = list.toArray(new String[0]);
		System.out.println("list to array : " + Arrays.toString(fruits));
		list = new ArrayList<>(Arrays.asList(fruits));
		System.out.println("array to arraylist : " + list);
	}
	
	
	public static void main(String[] args) 
	{
		ArrayListOperations operations = new ArrayListOperations();
		
		operations.addAndRetrieve();
		operations.iterateAndRemove();
		operations.searchElement();
		operations.arrayListSorting();
		operations.converting();
	}

}
