package com.mph.props;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyDao {
	private String dbname;
	private String uname;
	private String password;
	private Connection con;

	public MyDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyDao(String dbname, String uname, String password) {
		super();
		this.dbname = dbname;
		this.uname = uname;
		this.password = password;
	}

	public String getDbname() {
		return dbname;
	}

	public void setDbname(String dbname) {
		this.dbname = dbname;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "MyDao [dbname=" + dbname + ", uname=" + uname + ", password=" + password + "]";
	}
	
	public Connection getDbConnection() {
		try {
			System.out.println(this.toString());
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(dbname, uname, password);
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return con;
	}
}