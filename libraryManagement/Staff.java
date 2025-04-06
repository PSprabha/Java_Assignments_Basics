package libraryManagement;

public class Staff extends User {
    private String department;

    public Staff(String name, String ID, Account account, String department) {
    	super(name,ID,account);
    	this.department=department;
    }

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}
