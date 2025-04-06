package libraryManagement;

public class ManagementSystem {
	private String userType;
    private String username;
    private String password;

    public ManagementSystem(String userType, String username, String password) {
    	this.username=username;
    	this.userType=userType;
    	this.password=password;
    }

    public void login()
    {
    	System.out.print("login");
    }
    public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void register()
    {
    	System.out.print("register");
    }
    public void logout()
    {
    	System.out.print("logout");
    }
}
