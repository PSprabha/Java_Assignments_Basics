package class_and_objects;

public class BookDto
{
    private int id;
    private String title;
    private String author;
    private String isbn;
    private int price;
    private String publishDate;
    private String category; 	// (fictional or non fiction)
    private int pageCount;

    public BookDto()
    {
    	
    }

    public BookDto(int id, String title, String author, String isbn, int price, 
                   String publishDate, String category, int pageCount) 
    {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
        this.publishDate = publishDate;
        this.category = category;
        this.pageCount = pageCount;
    }

    public int getId() 
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }

    public String getTitle() 
    {
        return title;
    }

    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getAuthor()
    {
        return author;
    }

    public void setAuthor(String author) 
    {
        this.author = author;
    }

    public String getIsbn()
    {
        return isbn;
    }

    public void setIsbn(String isbn) 
    {
        this.isbn = isbn;
    }

    public int getPrice() 
    {
        return price;
    }

    public void setPrice(int price) 
    {
        this.price = price;
    }

    public String getPublishDate() 
    {
        return publishDate;
    }

    public void setPublishDate(String publishDate)
    {
        this.publishDate = publishDate;
    }

    public String getCategory() 
    {
        return category;
    }

    public void setCategory(String category) 
    {
        this.category = category;
    }

    public int getPageCount() 
    {
        return pageCount;
    }

    public void setPageCount(int pageCount) 
    {
        this.pageCount = pageCount;
    }
}

