
public class Student extends Person {

	/*
	 * B. Student firstName lastName phone gpa //constructor //getters and setters
	 * //toString method
	 */
	private double gpa;

	public Student(String firstName, String lastName, int phone, double gpa) {
		super(firstName, lastName, phone);
		this.gpa = gpa;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "student [gpa=" + gpa + "]";
	}

}
