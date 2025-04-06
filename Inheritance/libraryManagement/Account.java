package libraryManagement;

public class Account 
{
	private int borrowedBooks;
    private int reservedBooks;
    private int returnedBooks;
    private int lostBooks;
    private double fineAmount;

    public Account(int borrowedBooks, int reservedBooks, int returnedBooks, int lostBooks, double fineAmount) {}

    public double calculateFine()
    {
    	return 0.0;
    }

	public int getBorrowedBooks() {
		return borrowedBooks;
	}

	public void setBorrowedBooks(int borrowedBooks) {
		this.borrowedBooks = borrowedBooks;
	}

	public int getReservedBooks() {
		return reservedBooks;
	}

	public void setReservedBooks(int reservedBooks) {
		this.reservedBooks = reservedBooks;
	}

	public int getReturnedBooks() {
		return returnedBooks;
	}

	public void setReturnedBooks(int returnedBooks) {
		this.returnedBooks = returnedBooks;
	}

	public int getLostBooks() {
		return lostBooks;
	}

	public void setLostBooks(int lostBooks) {
		this.lostBooks = lostBooks;
	}

	public double getFineAmount() {
		return fineAmount;
	}

	public void setFineAmount(double fineAmount) {
		this.fineAmount = fineAmount;
	}
}
