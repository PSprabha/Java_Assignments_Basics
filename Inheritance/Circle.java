package Inheritance;

class Circle extends Shape 
{
	float radius;
	
	Circle(float radius)
	{
		this.radius = radius;
	}

	@Override	
	public double getArea()
	{
		double area = 3.14 * radius * radius;
		return area;
	}
}
