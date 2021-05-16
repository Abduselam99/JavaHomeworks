
public class Person {

	/*
	 * * Create an application that has the following three classes. Student and
	 * Instructor that inherit from the Person class. A . Person firstName lastName
	 * phone //constructor //getters and setters //toString method
	 **/

	private String firstName;
	private String lastName;
	private int phone;

	public Person(String firstName, String lastName, int phone) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "person [firstName=" + firstName + ", lastName=" + lastName + ", phone=" + phone + "]";
	}

}
