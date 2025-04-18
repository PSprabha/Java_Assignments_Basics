package university.courses;

public class Course 
{
    public String courseName;
    public String courseCode;

    public Course(String courseName, String courseCode) 
    {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    public void displayInfo() 
    {
        System.out.println("Course: " + courseName + " [" + courseCode + "]");
    }
}
