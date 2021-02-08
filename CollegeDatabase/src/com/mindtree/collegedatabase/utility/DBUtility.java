package com.mindtree.collegedatabase.utility;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mindtree.collegedatabase.exception.daoexception.DatabaseConnectionFailedException;

public class DBUtility {
	private final String URL = "jdbc:mysql://localhost:3306/colleges";
	private final String USER_NAME = "root";
	private final String PASSWORD = "mysqlroot";
			
	public Connection getMyConnection()  throws DatabaseConnectionFailedException{
		Connection con = null;
		//try {
			//
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			} 
		 catch (SQLException e) {
			throw new DatabaseConnectionFailedException("Databse could not be connected",e);
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return con;
	}

	public void closeResource(Connection con) {
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void closeResource(Statement st) {
		if (st != null) {
			try {
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void closeResource(PreparedStatement st) {
		if (st != null) {
			try {
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void closeResource(ResultSet st) {
		if (st != null) {
			try {
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
