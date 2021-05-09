
public class BankingAccount {

	public static void main(String[] args) {

		Account HagosAccount = new Account(" Hagos", " Gebru", 5000);
		Account JamesAccount = new Account(" James", "Bond ", 3000);

		System.out.println(HagosAccount);

		// withdraw money
		HagosAccount.debit(3000);

		// Deposit money

		HagosAccount.credit(1000);

		System.out.println(JamesAccount);

		// withdraw money
		JamesAccount.debit(4000);

	}

}
