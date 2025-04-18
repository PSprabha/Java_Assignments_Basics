package libraryManagementSystem;
import libraryManagementSystem.member.Member;
import libraryManagementSystem.books.Book;
import libraryManagementSystem.transactions.Transaction;

public class Main 
{

	public static void main(String[] args) 
	{
		Book book1 = new Book("Thirukural", "Thiruvalluvar");
        Member member1 = new Member("prabha", 33);

        Transaction txn = new Transaction();

        book1.displayInfo();
        member1.displayInfo();

        txn.borrowBook(book1, member1);
        book1.displayInfo();

        txn.returnBook(book1, member1);
        book1.displayInfo();
	}

}
