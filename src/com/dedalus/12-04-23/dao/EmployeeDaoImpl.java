package com.dedalus.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.dedalus.helper.MyDBConnection;
import com.dedalus.model.EmployeeModel;

public class EmployeeDaoImpl implements EmployeeDao{

	Connection con;
	PreparedStatement ps;
	Statement stmt;
	ResultSet rs;
	
	
	@Override
	public void insertEmployee(EmployeeModel emp) {
	     
		try {
			con  = MyDBConnection.getDbConnection();
			ps=con.prepareStatement("insert into dataemp values(?,?)");
			
			ps.setInt(1, emp.getEid());
			ps.setString(2, emp.getEname());
			int noofrows = ps.executeUpdate();
			System.out.println(noofrows  + " got inserted... ");
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		
	}

	@Override
	public void showEmployee() {	
		try {
			con  = MyDBConnection.getDbConnection();
			stmt= con.createStatement();
			rs = stmt.executeQuery("select * from dataemp");
			while(rs.next()) {
				System.out.println(rs.getInt(1) + " -- " + rs.getString(2));
				
			}
			
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		
	}

	@Override
	public void updateEmployee(EmployeeModel emp) {
		
		try {
			con  = MyDBConnection.getDbConnection();
			ps=con.prepareStatement("update dataemp set ename=? where eno=?");
			
			
			
			ps.setInt(2, emp.getEid());
			ps.setString(1, emp.getEname());
			
			ps.executeUpdate();

			System.out.println(" got updated... ");
		} catch (SQLException e) {

			e.printStackTrace();
		}		
	}
	

	@Override
	public void deleteEmployee(int eid) {
	
		try {
			con  = MyDBConnection.getDbConnection();
			ps=con.prepareStatement("delete from dataemp where eno= " + eid);
									
			ps.executeUpdate();

			System.out.println( eid + " is deleted... ");
		} catch (SQLException e) {

			e.printStackTrace();
		}		
	}

}
