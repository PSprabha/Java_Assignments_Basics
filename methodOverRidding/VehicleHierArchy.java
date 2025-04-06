package methodOverRidding;

public class VehicleHierArchy 
{
	public static void main(String[] args) 
	{
		Vehicle shine = new Bike("Shine", "Honda");
		Vehicle city = new Car("City", "Honda");
		
		shine.start();
		System.out.println();
		city.stop();
	}

}

abstract class Vehicle
{
	private String brandName;
	
	Vehicle(String brandName)
	{
		this.brandName = brandName;
	}
	
	abstract void start();
	abstract void stop();
}

abstract class TwoWheeler extends Vehicle
{
	private String bikeName;
	
	TwoWheeler(String bikename, String brandName)
	{
		super(brandName);
		this.bikeName = bikename;
	}
	
	public String getBikeName()
	{
		return this.bikeName;
	}
}

abstract class FourWheeler extends Vehicle
{
	private String carName;
	
	FourWheeler(String carName, String brandName)
	{
		super(brandName);
		this.carName = carName;
	}
	
	public String getCarName()
	{
		return this.carName;
	}
}


class Bike extends TwoWheeler
{
	Bike(String bikeName, String brandName)
	{
		super(bikeName, brandName);
	}
	
	@Override
	void start()
	{
		System.out.println("Vehicle Bike " + this.getBikeName() + " is now started!");
	}
	@Override
	void stop()
	{
		System.out.println("Vehicle Bike " + this.getBikeName() + " is not stopped!");
	}
}

class Car extends FourWheeler
{
	Car(String carName, String brandName)
	{
		super(carName, brandName);
	}
	
	@Override
	void start()
	{
		System.out.println("Vehicle Car " + this.getCarName() + " is now started!");
	}
	@Override
	void stop()
	{
		System.out.println("Vehicle Car " + this.getCarName() + " is not stopped!");
	}
}
