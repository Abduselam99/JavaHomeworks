import java.sql.*;
// 4. Write a java program that Calculates the total sum of the balances for all accounts and print it out.

public class JDBC_exersice4 {

	public static void main(String[] args) throws SQLException {

		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;

		String dbUrl = "jdbc:mysql://localhost:3306/bank";
		String user = "root";
		String pass = "bryce1@A";

		try {
			// 1. Get a connection to database
			myConn = DriverManager.getConnection(dbUrl, user, pass);
			myStmt = myConn.createStatement();

			String sql1 = "select sum(balance) from account ";
			System.out.println("excuted ");
			myRs = myStmt.executeQuery(sql1);
			int sum = 0;
			while (myRs.next()) {
				int counter = myRs.getInt(1);
				sum = sum + counter;
			}

			System.out.println("Total Balance: " + sum);

		} catch (Exception exc) {
			exc.printStackTrace();
		} finally {

			if (myRs != null) {
				myRs.close();
			}

			if (myStmt != null) {
				myStmt.close();
			}

			if (myConn != null) {
				myConn.close();
			}
		}
	}
}
