package Inheritance;

class Student 
{
	private String name;
	private short age;
	
	Student(String name, short age)
	{
		this.name = name;
		this.age = age;
	}
	String getName()
	{
		return this.name;
	}
	short getAge()
	{
		return this.age;
	}
}

class ZSGSStudent extends Student
{
	private int studentID;
	private String branch;
	
	ZSGSStudent(int id, String name, String branch, short age)
	{
		super(name, age);
		this.studentID = id;
		this.branch = branch;
	}
	
	int getId()
	{
		return this.studentID;
	}	
	String getName()
	{
		return super.getName();
	}	
	String getBranch()
	{
		return this.branch;
	}	
	short getAge()
	{
		return super.getAge();
	}
}


public class StudentMain 
{
	public static void main(String[] args)
	{
		Student prabha = new ZSGSStudent(33, "Sorna Prabhakaran", "Surandai", (short)22);
		
		System.out.println(prabha.getName());
		System.out.println(prabha.getAge());
	}
}
