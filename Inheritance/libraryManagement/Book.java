package libraryManagement;

public class Book 
{
	private String title;
	private String author;
	private String ISBN;
	private String publication;
	private boolean reservationStatus;
	private String feedback;
	private boolean bookRequest;
	private String renewInfo;
	
	public Book(String title, String author, String ISBN, String publication) {
		this.title=title;
		this.author=author;
		this.ISBN=ISBN;
		this.publication=publication;
		
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getISBN() {
		return ISBN;
	}
	
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	
	public String getPublication() {
		return publication;
	}
	
	public void setPublication(String publication) {
		this.publication = publication;
	}
	
	public boolean isReservationStatus() {
		return reservationStatus;
	}
	
	public void setReservationStatus(boolean reservationStatus) {
		this.reservationStatus = reservationStatus;
	}
	
	public String getFeedback() {
		return feedback;
	}
	
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	
	public boolean isBookRequest() {
		return bookRequest;
	}
	
	public void setBookRequest(boolean bookRequest) {
		this.bookRequest = bookRequest;
	}
	
	public String getRenewInfo() {
		return renewInfo;
	}
	
	public void setRenewInfo(String renewInfo) {
		this.renewInfo = renewInfo;
	}
	
	public void showDuet()
	{
		System.out.print("showDuet");
	}
}
