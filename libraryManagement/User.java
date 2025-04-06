package libraryManagement;

public class User {
	private String name;
	private String ID;
	private Account account;

	public User(String name, String ID, Account account) {
    	this.name=name;
    	this.ID=ID;
    	this.account=account;
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

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}


    public void verify() {
    	System.out.println("Verifying");
    }
    public void checkAccount()
    {
    	System.out.println("checking");
    }
    public void getBookInfo()
    {
    	System.out.println("getInfo");
    }
}
