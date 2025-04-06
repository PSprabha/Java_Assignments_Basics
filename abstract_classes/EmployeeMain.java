package abstract_classes;

import java.util.Scanner;

abstract class Employee 
{
    protected String name;
    protected int id;

    public Employee(String name, int id) 
    {
        this.name = name;
        this.id = id;
    }

    public abstract double calculatePay();

    public void getEmployeeDetails() 
    {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
    }
}



class HourlyEmployee extends Employee 
{
    private double hourlyRate;
    private int hoursWorked;

    public HourlyEmployee(String name, int id, double hourlyRate, int hoursWorked)
    {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay()
    {
        return hourlyRate * hoursWorked;
    }
}



class SalariedEmployee extends Employee
{
    private double monthlySalary;

    public SalariedEmployee(String name, int id, double monthlySalary) 
    {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculatePay()
    {
        return monthlySalary;
    }
}



public class EmployeeMain
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter employee type (1 for Hourly, 2 for Salaried): ");
        int type = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter employee ID: ");
        int id = scanner.nextInt();

        Employee employee;

        if (type == 1) 
        {
            System.out.print("Enter hourly rate: ");
            double rate = scanner.nextDouble();
            System.out.print("Enter hours worked: ");
            int hours = scanner.nextInt();

            employee = new HourlyEmployee(name, id, rate, hours);
        } 
        else 
        {
            System.out.print("Enter monthly salary: ");
            double salary = scanner.nextDouble();

            employee = new SalariedEmployee(name, id, salary);
        }

        System.out.println("\n=== Employee Details ===");
        employee.getEmployeeDetails();
        System.out.println("Calculated Pay: ₹" + employee.calculatePay());

        scanner.close();
    }
}

