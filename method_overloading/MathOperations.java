package method_overloading;

public class MathOperations 
{
	public int add(int a, int b)
	{
		return a+b;
	}
	
	public double add(double a, int b)
	{
		return a+b;
	}
	
	public double add(int a, double b)
	{
		return a+b;
	}
	
	public double add(double a, double b)
	{
		return a+b;
	}
	
	
	public int subtract(int a, int b)
	{
		return a+b;
	}
	
	public double subtract(double a, int b)
	{
		return a+b;
	}
	
	public double subtract(int a, double b)
	{
		return a+b;
	}
	
	public double subtract(double a, double b)
	{
		return a+b;
	}
	
	
	
	public int multiply(int a, int b)
	{
		if(a == 0 || b == 0)
			return 0;
		
		return a+b;
	}
	
	public double multiply(double a, int b)
	{
		if(a == 0 || b == 0)
			return 0;
		
		return a+b;
	}
	
	public double multiply(int a, double b)
	{
		if(a == 0 || b == 0)
			return 0;
		
		return a+b;
	}
	
	public double multiply(double a, double b)
	{
		if(a == 0 || b == 0)
			return 0;
		
		return a+b;
	}
	
	
	
	public int divide(int a, int b)
	{
		if(a == 0 || b == 0)
			return 0;
		
		return a+b;
	}
	
	public double divide(double a, int b)
	{
		if(a == 0 || b == 0)
			return 0;
		
		return a+b;
	}
	
	public double divide(int a, double b)
	{
		if(a == 0 || b == 0)
			return 0;
		
		return a+b;
	}
	
	public double divide(double a, double b)
	{
		if(a == 0 || b == 0)
			return 0;
		
		return a+b;
	}
	
	

	public static void main(String[] args) 
	{
		MathOperations maths = new MathOperations();
		
		System.out.println(maths.add(33.3, 3));
		System.out.println(maths.subtract(55, 8));
		System.out.println(maths.multiply(17.4, 2));
		System.out.println(maths.divide(40, 3));
	}

}
