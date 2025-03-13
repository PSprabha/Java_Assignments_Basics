package constructor;
import class_and_objects.EmployeeDto;
import java.util.*;

public class EmployeeController
{
	static ArrayList<EmployeeDto> employeesList = new ArrayList<>();
	
	static void displayEmployees()
	{
		for(EmployeeDto employees : employeesList)
				System.out.println(employees.getName());
	}
	
	public static void main(String[] args) 
	{
		employeesList.add(new EmployeeDto(123l, "Prabha", "karan@gmail.com", "poly", "Software Developer", 10000, "03-11-2002", "75300"));
		employeesList.add(new EmployeeDto(124l, "sathish", "karan@gmail.com", "poly", "Software Developer", 10000, "03-11-2002", "75300"));
		employeesList.add(new EmployeeDto(125l, "kavi", "karan@gmail.com", "poly", "Software Developer", 10000, "03-11-2002", "75300"));
		employeesList.add(new EmployeeDto(126l, "siva", "karan@gmail.com", "poly", "Software Developer", 10000, "03-11-2002", "75300"));
		employeesList.add(new EmployeeDto(127l, "kasi", "karan@gmail.com", "poly", "Software Developer", 10000, "03-11-2002", "75300"));
		
		displayEmployees();
	}

}
