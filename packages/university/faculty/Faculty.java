package university.faculty;

public class Faculty 
{
    public String name;
    public String department;

    public Faculty(String name, String department) 
    {
        this.name = name;
        this.department = department;
    }

    public void displayInfo() 
    {
        System.out.println("Faculty: " + name + ", Department: " + department);
    }
}
