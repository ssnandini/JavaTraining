package com.dedalus.view;

import com.dedalus.model.*;

public class ArraySample {

	public static void main(String[] args) {
		EmployeeModel emp1 = new EmployeeModel();
		EmployeeModel emp2 = new EmployeeModel();
		EmployeeModel[] empArr = new EmployeeModel[2];
		
		/*
		int[] val = new int[3];
		val[0] = 1;
		val[1] = 2;
		val[2] = 3;
		
		for (int i=0; i< val.length; i++)
		{
			System.out.println(val[i]);
		}
*/
		
		emp1.setEid(1);
		emp1.setEname("SSN");
		emp2.setEid(2);
		emp2.setEname("SRS");
		

		empArr[0]=emp1;
		empArr[1]=emp2;

		for(EmployeeModel i : empArr)
		{
			System.out.println(i);
		}
		
		
	}

}
