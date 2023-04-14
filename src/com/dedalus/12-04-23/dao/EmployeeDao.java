package com.dedalus.dao

import com.dedalus.model.*;

public interface EmployeeDao {
	
	public void insertEmployee(EmployeeModel emp);
	public void showEmployee();
	public void updateEmployee(EmployeeModel emp);
	public void deleteEmployee(int eid);

}
