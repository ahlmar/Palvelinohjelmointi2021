package fi.syksy2021.Week2AllExes.domain;

public class Student {
	private String FirstName,LastName ;

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public Student(String firstName, String lastName) {
		super();
		FirstName = firstName;
		LastName = lastName;
	}
	
	

	

}
