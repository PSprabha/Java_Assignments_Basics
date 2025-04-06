package Inheritance;

abstract class Vehicle
{
	int wheelsCount;
	int seatsCount;
	
	Vehicle(int wheels, int seats)
	{
		wheelsCount = wheels;
		seatsCount = seats;
	}
	
	abstract String engineType();
}

class TwoWheelers extends Vehicle
{
	TwoWheelers()
	{
		super(2, 2);
	}
	
	protected String engineType()
	{
		return "Bikes have 2 Strokes Engine";
	}
}
class Bike extends TwoWheelers
{
	int wheelsCount()
	{
		return super.wheelsCount;
	}
	
	int seatsCount()
	{
		return super.seatsCount;
	}
}

class FourWheelers extends Vehicle
{
	FourWheelers()
	{
		super(4, 5);
	}
	
	protected String engineType()
	{
		return "Cars have 4 Strokes Engine";
	}
}
class Car extends FourWheelers
{
	int wheelsCount()
	{
		return super.wheelsCount;
	}
	
	int seatsCount()
	{
		return super.seatsCount;
	}
}


public class VehicleHierarchy 
{

	public static void main(String[] args) 
	{
		Bike bike = new Bike();		
		Car car = new Car();
		
		System.out.println(bike.seatsCount());
		System.out.println(bike.engineType());
		
		System.out.println(car.seatsCount());
		System.out.println(car.engineType());
	}

}
