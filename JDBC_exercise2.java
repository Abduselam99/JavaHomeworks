import java.sql.*;

// 2. Write a java program to double the balances of each record (hint update each record)

public class JDBC_exercise2 {

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

			String sql = "update account set balance = balance *2";
			myStmt.executeUpdate(sql);

			String sql1 = "select * from account";
			myStmt.executeQuery(sql1);

			// 4. Process the result set
			while (myRs.next()) {
				System.out.println(myRs.getString("first_name") + " \t " + myRs.getDouble("balance"));
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
