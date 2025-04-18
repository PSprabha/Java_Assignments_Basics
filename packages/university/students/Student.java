package university.students;

public class Student 
{
    public String name;
    public int studentId;

    public Student(String name, int studentId) 
    {
        this.name = name;
        this.studentId = studentId;
    }

    public void displayInfo() 
    {
        System.out.println("Student ID: " + studentId + ", Name: " + name);
    }
}
