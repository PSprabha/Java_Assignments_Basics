package Inheritance;

public class Rectangle extends Shape
{
	float length;
	float breadth;
	
	Rectangle(float length, float breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}
	@Override
	public double getArea()
	{
		return this.length * this.breadth;
	}
}
