package assignments;
import java.util.*;

public class ConditionalAndUnconditional 
{
	static Scanner scanner = new Scanner(System.in);
	
	static void greatestOfThree()
	{
		System.out.println("Enter three numbers!");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		if(a > b && a > c)
		{
			System.out.println("variable a is greatest one : " + a);
		}
		else if(b > c && b > a)
		{
			System.out.println("variable b is greatest one : " + b);
		}
		else 
			System.out.println("variable c is greatest one : " + c);
	}

	
	static void getGrade()
	{
		System.out.println("enter your score : ");
		int score = scanner.nextInt();
		
		if(score>=90) 
		{
			System.out.println("Grade : A");
		}
		else if(score>=75) 
		{
			System.out.println("Grade : B");
		}
		else if(score>=60) 
		{
			System.out.println("Grade : C");
		}
		else if(score>=50)
		{
			System.out.println("Grade : D");
		}
		else if(score>=35) 
		{
			System.out.println("Grade : E");
		}
		else 
		{
			System.out.println("Reappear! ");
		}
		
	}
	
	static void multiplicationTaple()
	{
		System.out.println("enter the number which table u want : ");
		int table = scanner.nextInt();
		System.out.println("enter the number how many multiplication takes the table : ");		
		int n = scanner.nextInt();
		
		for(int i = 1; i <= n; i++)
		{
			System.out.println(i+" * "+table+" = "+(i*table));
		}		
	}
	
	static void secondOccure()
	{
		int[] nums = {20, 40, 60, 70, 33, 20};
		int target = 20;
		boolean flag = false;
		
		for(int i = 0; i < nums.length; i++)
		{
			int n = nums[i];
			if(flag && n == target)
			{
				System.out.println("Index of given target is : " + i);
				return;
			}
			if(n == target)
			{
				flag = true;
			}
		}
		
		System.out.println("Given target is not occure second time!");
	}

	
	static void findPrime()
	{
		int start = 1, end = 30;
		System.out.println(start++ + " is not a prime number!");
		System.out.println(start++ + " is a prime number!");
		
		while(start <= end)
		{
			int n = (int)Math.sqrt(start);
			boolean flag = false;
			
			for(int i = 2; i <= n; i++)
			{
				if(start % i == 0)
				{
					System.out.println(start + " is not a prime number!");	
					flag = true;
					break;
				}
			}
			
			if(!flag)
			{
				System.out.println(start + " is a prime number!");
			}
			start++;
		}
	}
	
	static void sumOfEven()
	{
		int[] nums = {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		
		for(int n : nums)
			if(n % 2 == 0) sum += n;
		
		System.out.println(sum);
	}
	
	
	public static void main(String[] args) 
	{
		greatestOfThree();
		getGrade();
		multiplicationTaple();
		secondOccure();
		findPrime();
		sumOfEven();
	}

}
