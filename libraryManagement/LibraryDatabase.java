package libraryManagement;

public class LibraryDatabase {
	 public void add(Book book)
	 {
		 System.out.print("add");
	 }
   public void delete(Book book)
   {
   	System.out.print("delete");
   }
   public void update(Book oldBook, Book newBook)
   {
   	System.out.print("update");
   }
   public void display()
   {
   	System.out.print("display");
   }
   public void search(String title)
   {
   	System.out.print("search");
   }
}
