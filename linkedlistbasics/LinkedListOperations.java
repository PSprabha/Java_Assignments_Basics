package linkedlistbasics;

import java.util.*;

public class LinkedListOperations 
{

	void addAndAccess()
	{
		LinkedList<Integer> nums = new LinkedList<>();
		nums.add(5);
		nums.add(10);
		nums.add(15);
		nums.add(20);
		nums.add(25);
		
		System.out.println(nums.getFirst());
		System.out.println(nums.getLast());
	}
	
	
	
	void iterateAndModify()
	{
		LinkedList<String> nums = new LinkedList<>();
		nums.push("one");
		nums.push("two");
		nums.push("three");
		nums.push("four");
		nums.push("five");
		
		System.out.println("Before change the value : " + nums);
		ListIterator<String> iterator = nums.listIterator();
		
		while(iterator.hasNext())
		{
			if(iterator.next().equals("three"))
				iterator.set("THREE");
		}
		System.out.println("After change the value : " + nums);
	}
	
	
	
	
	void removeOperations()
	{
		LinkedList<Integer> nums = new LinkedList<>();
		
		for(int i = 1; i < 11; i++)
			nums.offer(i);

		System.out.println("Before removing : " + nums);
		
		nums.remove(2);
		nums.removeLast();
		
		System.out.println("After removing : " + nums);
	}
	
	
	
	
	void operationsLikeQueue()
	{
		Queue<String> names = new LinkedList<>(); 		
		names.offer("Prabha");
		names.offer("siva");
		names.offer("kavi");
		names.offer("kasi");
		names.offer("size");

		System.out.println("Before removal : " + names);
		
		names.poll();
		names.poll();
		
		System.out.println("After removal : " + names);
	}
	
	
	
	
	void reversing()
	{
		LinkedList<Character> chars = new LinkedList<>();
		chars.add('a');
		chars.add('b');
		chars.add('c');
		chars.add('d');
		chars.add('e');
		
		System.out.println("Before reverse : " + chars);

		LinkedList<Character> reversedChars = toReverse(chars);	
		
		System.out.println("After reverse : " + reversedChars);
	}
	
	LinkedList<Character> toReverse(LinkedList<Character> chars)
	{
		LinkedList<Character> reversedChars = new LinkedList<>();
		int len = chars.size();
		
		for(int i = 0; i < len; i++)
			reversedChars.add(chars.removeLast());
		
		return reversedChars;
	}
	
	
	
	
	public static void main(String[] args) 
	{
		LinkedListOperations operations = new LinkedListOperations();
		
		operations.addAndAccess();
		operations.iterateAndModify();
		operations.removeOperations();
		operations.operationsLikeQueue();
		operations.reversing();
	}

}
