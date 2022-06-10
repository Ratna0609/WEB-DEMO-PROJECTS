package com.javaexperts.application.util;

import java.sql.*;

public class JDBCUtil {
	static {
		try {
			//Class.forName("com.mysql.jdbc.Driver");
		Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException ex) {
			System.out.println(ex);
		}

	}

	public static Connection getMYSQLConncetion() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/javaexperts";
		Connection con = DriverManager.getConnection(url, "root", "admin");
		return con;
	}

	public static void cleanup(Statement st, Connection con) {
		try {
			if (st != null)
				st.close();
			if (con != null)
				con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public static void cleanup(ResultSet rs, Statement st, Connection con) {
		try {
			if (rs != null)
				rs.close();
			if (st != null)
				st.close();
			if (con != null)
				con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
