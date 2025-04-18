package libraryManagementSystem.member;

public class Member 
{
    public String name;
    public int memberId;

    public Member(String name, int memberId) 
    {
        this.name = name;
        this.memberId = memberId;
    }

    public void displayInfo() 
    {
        System.out.println("Member ID: " + memberId + ", Name: " + name);
    }

}
