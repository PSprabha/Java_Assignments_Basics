package university;

import university.students.Student;
import university.courses.Course;
import university.faculty.Faculty;

public class Main 
{
    public static void main(String[] args) 
    {
        Student student = new Student("Prabha", 1105255);
        Course course = new Course("BA English", "AMEN51");
        Faculty faculty = new Faculty("Damu", "Personality Development");

        student.displayInfo();
        course.displayInfo();
        faculty.displayInfo();
    }
}
