package libraryManagement;

public class Student extends User {
    private String className;

    public Student(String name, String ID, Account account, String className) {
    	super(name,ID,account);
    	this.className=className;
    }

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}


}
