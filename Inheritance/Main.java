package Inheritance;

public class Main 
{
	public static void main(String[] s)
	{
		Rectangle rect = new Rectangle(33, 44);
		Circle circle = new Circle(33);
		
		System.out.println("Rectangle's Area is : " + rect.getArea());
		System.out.println("Circle's Area is : " + circle.getArea());
	}
}
