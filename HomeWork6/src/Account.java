
public class Account {

	/*
	 * Create a class called Account that includes four pieces of information as
	 * instance variables First Name (String) Last Name (String) Account Number
	 * (long) Balance (double)
	 */

	private String firstName;
	private String lastName;
	private long accountNo;
	private double balance;

	public static long accountIncrement = 1000;

	/*
	 * Your class should have a constructor that initializes the four instance
	 * variables. Provide a set and a get method for each instance variable.
	 */

	public Account(String firstName, String lastName, double balane) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		accountIncrement = accountIncrement + 1;
		this.accountNo = accountIncrement;
		this.balance = balane;
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

	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public double getBalane() {
		return balance;
	}

	public void setBalane(double balane) {
		this.balance = balane;
	}

	@Override
	public String toString() {
		return "Account [firstName=" + firstName + ", lastName=" + lastName + ", accountNo=" + accountNo + ", balance="
				+ balance + "]";
	}

	/*
	 * add methods called debit and credit debit : withdraws money from the Account.
	 * Ensure that the debit amount does not exceed the Account’s balance. If it
	 * does, the balance should be left unchanged and the method should print a
	 * message “Insufficient Balance” Credit: that adds money to the balance and
	 * prints the final balance.
	 */

	public void debit(double withdrawAmount) {

		if (balance < withdrawAmount) {
			System.out.println("Insufficient Balance! ");
		} else {
			balance = balance - withdrawAmount;
			System.out.println("You have withdraw " + withdrawAmount + " " + "Your new balance is : " + balance);
		}

	}

	public void credit(double depositAmount) {
		balance = balance + depositAmount;
		System.out.println("You have deposit " + depositAmount + " " + "Your new balance is : " + balance);

	}
}
