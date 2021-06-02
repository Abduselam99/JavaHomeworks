import java.sql.*;
// 5. Write a java program to Print the account details(first_name, last_name and balance) of the accounts with highest balance and lowest balance.
	//	Example:	‘Highest Balance: john, Doe, 9500
			//		‘Lowes Balance:  dave, james, 1500

public class JDBC_exercise5 {

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

			String sql1 = "select * from account order by balance asc limit 1";
			System.out.println("excuted balance");
			myRs= myStmt.executeQuery(sql1);

			// 4. Process the result set
			while (myRs.next()) {
				System.out.println("The lowest balance "+ myRs.getString("first_name") + " \t " + myRs.getString("last_name") + " \t " + myRs.getDouble("balance"));
			}

			String sql2 = "select * from account order by balance desc limit 1";
			System.out.println("excuted balance");
			myRs= myStmt.executeQuery(sql2);
			
			while (myRs.next()) {
				System.out.println("The highest balance "+ myRs.getString("first_name") + " \t " + myRs.getString("last_name") + " \t " + myRs.getDouble("balance"));
			}

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
