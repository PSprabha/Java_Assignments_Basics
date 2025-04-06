package libraryManagement;

public class Librarian {
	private String name;
    private String ID;
    private String password;
    private String searchString;

    public Librarian(String name, String ID, String password, String searchString) {}

    public void verifyLibrarian()
    {
    	System.out.println("verify");
    }
    public void search(LibraryDatabase db)
    {
    	System.out.println("searching");
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSearchString() {
		return searchString;
	}

	public void setSearchString(String searchString) {
		this.searchString = searchString;
	}
}
