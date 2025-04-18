package libraryManagementSystem.books;

public class Book
{
	public String title;
    public String author;
    public boolean isAvailable;

    public Book(String title, String author) 
    {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public void displayInfo() 
    {
        System.out.println("Book: " + title + " by " + author + " | Available: " + isAvailable);
    }
}
