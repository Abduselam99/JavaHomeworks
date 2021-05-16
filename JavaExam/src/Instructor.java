
public class Instructor extends Person{
	/*
	 * C. Instructor firstName lastName phone grossSalary //constructor //getters
	 * and setters //toString method //calculateNetSalary - this method takes gross
	 * salary and returns net salary assuming tax as 20%.
	 * 
	 */
	private double grossSalary;

	public Instructor(String firstName, String lastName, int phone, double grossSalary) {
		super(firstName, lastName, phone);
		this.grossSalary = grossSalary;
	}

	public double getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}

	@Override
	public String toString() {
		return "instructor [grossSalary=" + grossSalary + "]";
	}
	public void NetSalary () {
	double net = grossSalary * .20;
	}
}
