package libraryManagementSystem.transactions;
import libraryManagementSystem.member.Member;
import libraryManagementSystem.books.Book;

public class Transaction 
{
	public void borrowBook(Book book, Member member) 
	{
        if (book.isAvailable) 
        {
            book.isAvailable = false;
            System.out.println(member.name + " borrowed \"" + book.title + "\"");
        } 
        else 
        {
            System.out.println("Sorry! \"" + book.title + "\" is not available.");
        }
    }

    public void returnBook(Book book, Member member) 
    {
        book.isAvailable = true;
        System.out.println(member.name + " returned \"" + book.title + "\"");
    }
}
