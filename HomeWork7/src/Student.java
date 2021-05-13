
public class Student implements Comparable<Student> {

	private String firstName;
	private int age;

	// constructor here

	public Student(String firstName, int age) {
		super();
		this.firstName = firstName;
		this.age = age;
	}

	// getter and setters here

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// add toString methode here
	@Override
	public String toString() {
		return "Student [firstName =" + firstName + ", age =" + age + "]";
	}

	@Override
	public int compareTo(Student students2) {
		int compareInt = this.firstName.compareTo(students2.firstName);
		if (compareInt < 0) {
			return -1;
		} else if (compareInt > 0) {
			return 1;
		} else {
			return 0;
		}

	}

}
