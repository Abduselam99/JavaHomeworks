
public class Exercise1 {

	public static void main(String[] args) {
		/* Write a program that have variables 
			Name (String)
			city_and_state (String)
			gross salary (double)
			tax (double) = 0.2
			net_salary(double)
			//Tax is always 20%.
			And print out the following.
			Eg: Hello my name is John Doe, I live in Charlotte NC, my gross salary is $100,000. I pay $20,000 in tax and I take home $80,000.
		 	*/
		String Name = "Abduelam Abdelkadir";
		String City = "Saint Paul";
		String State = "MN";
		double gross_salary = 100000.00;
		double tax = .2;
		double total_tax = gross_salary * tax;
		double net_salary = gross_salary - total_tax;
		System.out.println("Hello my name is "+ Name + ","+" i live in " + 
							City +" "+ State +",\n"+ "my gross salary is $" + 
							gross_salary+ " I pay $" + total_tax + 
							" in tax and i take home $" + net_salary);
		
	}

}
