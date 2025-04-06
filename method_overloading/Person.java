package method_overloading;

public class Person 
{
	Person(String name)
	{
		System.out.print("The person's name is " + name);
	}
	
	
	Person(String name, int age)
	{
		System.out.println();
		System.out.print("The person's name is " + name);		
		System.out.print(" and the person's age is " + age);		
	}
	
	
	Person(String name, int age, String address)
	{
		System.out.println();
		System.out.print("The person's name is " + name);		
		System.out.print(" and the person's age is " + age);	
		System.out.print(" and the person's address is " + address);			
	}
	
	
	public static void main(String[] arg)
	{
		Person name = new Person("Prabha");
		
		Person nameAge = new Person("Prabha", 22);
		
		Person personDetails = new Person("Prabha", 22, "hi");
	}
}
