package assignments;

import java.util.Scanner;

public class ScopeAndOperators 
{	
	static void celsiusToFharenheit()
	{
		float celsius = 21.5f;
		double fharenheit = (celsius * 1.8) + 32;
		
		System.out.println("fharenheit is : " + fharenheit);
	}
	
	static void quadraticEquation()
	{
		int a = 1;
		int b = 2;
		int c = 1;
		
		int bSq = b*b;
		b = -b;
		int fAc = 4*a*c;
		int inRoot = bSq-fAc;
		int tA = 2*a;
		
		System.out.println((b+Math.sqrt(inRoot))/tA);
		System.out.println((b-Math.sqrt(inRoot))/tA);
		
	}
	
	static void bitwiseOperators()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers..");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		System.out.println("Bitwise OR-> a|b = "+a+" | "+b+" = "+(a|b));

		System.out.println("Bitwise AND-> a&b = "+a+" & "+b+" = "+(a&b));

		System.out.println("Bitwise XOR-> a^b = "+a+" ^ "+b+" = "+(a^b));

		System.out.println("Left shift a<<2 -> "+a+" << 2 = "+(a<<2));

		System.out.println("Right shift b>>2 -> "+b+" >> 2 = "+(b>>2));
	}
	
	static void variableScope()
	{
		int a = 10;
		if(a==10) 
		{
			int b = 5;
			System.out.println("a = "+a+", b = "+b);
		}
//		System.out.println("a = "+a+", b = "+b); 
//		It throws the compiler error. Because variable 'b' scope is only inside the if block.		
	}
	public static void main(String[] args) 
	{
		celsiusToFharenheit();
		System.out.println();
		quadraticEquation();
		System.out.println();
		bitwiseOperators();
		System.out.println();
		variableScope();
	}

}
