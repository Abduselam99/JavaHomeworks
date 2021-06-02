import java.sql.*;

/*
 * 
	Create database called bank that have a table called account with below columns
	account_no integer (primary e=key
	first_name String
	last_name String
	balance decimal

1. Write a java program to Insert 5 records into the account table using prepared statement 
2. Write a java program to double the balances of each record (hint update each record)
3. Write a java program to retrieve all records in the ascending order of their balance and print out the first_name and balance.
4. Write a java program that Calculates the total sum of the balances for all accounts and print it out.
5. Write a java program to Print the account details(first_name, last_name and balance) of the accounts with highest balance and lowest balance.
		Example:	‘Highest Balance: john, Doe, 9500
					‘Lowes Balance:  dave, james, 1500


 */

public class JDBC_exercise1 {

	public static void main(String[] args) throws SQLException {

		Connection myConn = null;
		PreparedStatement myStmt = null;
		ResultSet myRs = null;
		int insertedValue;

		String dbUrl = "jdbc:mysql://localhost:3306/bank";
		String user = "root";
		String pass = "bryce1@A";

		try {
			// 1. Get a connection to database
			myConn = DriverManager.getConnection(dbUrl, user, pass);

			String sql = "insert into account values (?,?,?,?)";
			myStmt = myConn.prepareStatement(sql);
			
			myStmt.setInt(1, 1);
			myStmt.setString(2, "Kibrom");
			myStmt.setString(3, "Mebrahtu");
			myStmt.setDouble(4, 1000.00);
			insertedValue = myStmt.executeUpdate();
			
			myStmt.setInt(1, 2);
			myStmt.setString(2, "Tes");
			myStmt.setString(3, "Alemu");
			myStmt.setDouble(4, 2000.00);
			insertedValue = myStmt.executeUpdate();

			myStmt.setInt(1, 3);
			myStmt.setString(2, "John");
			myStmt.setString(3, "Robert");
			myStmt.setDouble(4, 3000.00);
			insertedValue = myStmt.executeUpdate();

			myStmt.setInt(1, 4);
			myStmt.setString(2, "James");
			myStmt.setString(3, "Bond");
			myStmt.setDouble(4, 4000.00);
			insertedValue = myStmt.executeUpdate();
			
			myStmt.setInt(1, 5);
			myStmt.setString(2, "Mugi");
			myStmt.setString(3, "Anderson");
			myStmt.setDouble(4, 5000.00);
			insertedValue = myStmt.executeUpdate();


			System.out.println("\nCompleted successfully!" + insertedValue);
			// myRs = myStmt.executeQuery("select * from account");

			// 4. Process the result set

		} catch (Exception exc) {
			exc.printStackTrace();
		} finally {

			if (myStmt != null) {
				myStmt.close();
			}

			if (myConn != null) {
				myConn.close();
			}
		}
	}
}
