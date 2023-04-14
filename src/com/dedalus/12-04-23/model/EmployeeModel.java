package com.dedalus.model;
//POJO -= Plain Old Java Object

import java.io.*;
import java.util.Comparator;

public class EmployeeModel implements Serializable, Comparable<EmployeeModel> {

	private int eid;
	private String ename;
	
	 public EmployeeModel()
	 {		 
		 System.out.println("From Employee Constructor");
	 }
	 public EmployeeModel(int eno,String ename)
	 {		 
		this.eid =eno;
		this.ename = ename;
	 }
	 

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + "]";
	}
	
	@Override
	public int compareTo(EmployeeModel e) {
		
		return this.eid - e.eid;
	
	}
	
	public static Comparator<EmployeeModel> NameComparator = new Comparator<EmployeeModel>() {

		@Override
		public int compare(EmployeeModel e1, EmployeeModel e2) {
			// TODO Auto-generated method stub
			return e1.getEname().compareTo(e2.getEname());
		}
	};

}
