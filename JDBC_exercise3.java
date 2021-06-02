import java.sql.*;

// 3. Write a java program to retrieve all records in the ascending order of their balance and print out the first_name and balance.
public class JDBC_exercise3 {

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

			String sql1 = "select * from account order by balance asc";
			System.out.println("excuted balance");
			myRs= myStmt.executeQuery(sql1);

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
