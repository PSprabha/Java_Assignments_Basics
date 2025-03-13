package class_and_objects;

public class EmployeeDto 
{
    private Long id;
    private String name;
    private String email;
    private String department;
    private String position;
    private int salary; 
    private String hireDate;
    private String phoneNumber;

    public EmployeeDto() 
    {
    	
    }

    public EmployeeDto(Long id, String name, String email, 
                       String department, String position, int salary, 
                       String hireDate, String phoneNumber) 
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.department = department;
        this.position = position;
        this.salary = salary;
        this.hireDate = hireDate;
        this.phoneNumber = phoneNumber;
    }

    public Long getId() 
    {
        return id;
    }

    public void setId(Long id) 
    {
        this.id = id;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getEmail() 
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getDepartment() 
    {
        return department;
    }

    public void setDepartment(String department) 
    {
        this.department = department;
    }

    public String getPosition() 
    {
        return position;
    }

    public void setPosition(String position) 
    {
        this.position = position;
    }

    public int getSalary() 
    {
        return salary;
    }

    public void setSalary(int salary) 
    {
        this.salary = salary;
    }

    public String getHireDate()
    {
        return hireDate;
    }

    public void setHireDate(String hireDate)
    {
        this.hireDate = hireDate;
    }

    public String getPhoneNumber() 
    {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) 
    {
        this.phoneNumber = phoneNumber;
    }
}

