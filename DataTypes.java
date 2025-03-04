package assignments;
import java.util.Scanner;

class Class1
{
	public static void main(String[] args)
	{
		System.out.println("inside the class 1");
	}
}

class Class2
{
	public static void main(String[] args)
	{
		System.out.println("Inside the class 2");
	}
}


public class DataTypes
{
	
	static void typeConvertion()
	{
		float fl = 15.5f;
		int n = (int)fl;
		System.out.println("float : " + fl);
		System.out.println("convert to integer : " + n);
		System.out.println();
		
		double dl = 33.33333333333;
		float convertFl = (float) dl;
		System.out.println("double : " + dl);
		System.out.println("convert to float : " + convertFl);
		System.out.println();
		
		int num = 1000;
		short s = (short) num;
		System.out.println("integer to short : " + s);
		System.out.println();
	}
	
	static void swapTwoNum()
	{
		int a = 10, b = 5;
		System.out.println("a = " + a + " b = " + b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("a = " + a + " b = " + b);
		System.out.println();
	}
	
	static void averageWeight()
	{
		byte prabha = 70;
		byte kumaran = 60;
		byte kaski = 80;
		byte santhosh = 40;
		byte naveen = 70;
		byte siva = 50;
		byte sathish = 50;
		byte kaasi = 70;
		byte subramani = 70;
		byte kavi = 100;
		
		short total_weight = (short) (prabha+kumaran+kaski+santhosh+naveen+siva+sathish+kaasi+subramani+kavi);
		short average = (short) (total_weight/10);
		
		System.out.println("avaerage weight is : " +  average);
	}
	
	
	enum DaysOfWeek
	{	
		SUNDAY,
		MONDAY,
		TUESDAY,
		WEDNESDAY,
		THURSDAY,
		FRIDAY,
		SATURDAY
	}
	
	static void getDay()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter which day you want : ");
		
		int getDay = scan.nextInt();
		
		while(getDay == 0)
		{
			System.out.println("Days or start with number 1! ");
			System.out.println("Please enter the day's number greater than 0 : ");
			getDay = scan.nextInt();
		}
		DaysOfWeek[] days = DaysOfWeek.values();
		System.out.println(days[getDay]);
	}
	
	public static void main(String[] args) 
	{
		typeConvertion();
		System.out.println("There are 3 class files");
		System.out.println();
		swapTwoNum();
		averageWeight();
		System.out.println();
		getDay();
	}

}

