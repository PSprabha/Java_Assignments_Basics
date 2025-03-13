package constructor;

import java.util.*;

import class_and_objects.BookDto;

public class BookController 
{

	static ArrayList<BookDto> booksList = new ArrayList<>();
	
	static void displayBooks()
	{
		for(BookDto books : booksList)
				System.out.println(books.getTitle());
	}
	
	public static void main(String[] args) 
	{
		booksList.add(new BookDto(123, "Bagavath Geethai", "Vyasa", "abs123", 200, "03-11-2002", "Divotinal", 300));
		booksList.add(new BookDto(123, "Ramayanam", "Vyasa", "abs123", 200, "03-11-2002", "Divotinal", 300));
		booksList.add(new BookDto(123, "Akanaanooru", "Vyasa", "abs123", 200, "03-11-2002", "Divotinal", 300));
		booksList.add(new BookDto(123, "Puranaanooru", "Vyasa", "abs123", 200, "03-11-2002", "Divotinal", 300));
		booksList.add(new BookDto(123, "Thirukural", "Vyasa", "abs123", 200, "03-11-2002", "Divotinal", 300));
		
		
		displayBooks();
	}

}
