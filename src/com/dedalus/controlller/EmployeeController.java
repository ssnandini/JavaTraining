package com.dedalus.controlller;

import java.util.Scanner;
import java.io.*;
import com.dedalus.model.EmployeeModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;



public class EmployeeController implements EmpInterface {
//	EmployeeModel emp = new EmployeeModel();
	EmployeeModel emp ;
		
	List<EmployeeModel> EmpList = new ArrayList<EmployeeModel>();    
	public void addEmployee()
	{		
		Scanner sc = new Scanner(System.in);
		emp = new EmployeeModel();
		
		
		 
		System.out.println("Enter Eid");
		int eid= sc.nextInt();
		emp.setEid(eid);
		
		System.out.println("Enter Ename");
		String ename= sc.next();
		emp.setEname(ename);
		System.out.println("Employee Added Succesfully");
		
		EmpList.add(emp);
	//	sc.close();

	}
	
	public void viewEmployee() {
		// System.out.println(emp);
		Iterator i = EmpList.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
	
	public void serialiseEmployee()  {
		try{
			FileOutputStream fos = new FileOutputStream("dedalus.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(emp);
						
			System.out.println("Serilized to file dedalus.txt");
			oos.close();
			fos.close();
			}
			catch(FileNotFoundException fnf)
			{
				System.out.println("No file");
			}
		catch (IOException exp)
		{
			System.out.println("IO Exception");
		}
				
	}
	
	public void deserialiseEmployee() {
		try {

			FileInputStream fis = new FileInputStream("dedalus.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);

			EmployeeModel emp = (EmployeeModel) ois.readObject();
			System.out.println("DeSerilized from file dedalus.txt");
			System.out.println(emp.getEid());
			System.out.println(emp.getEname());
			ois.close();
			fis.close();
		} catch (FileNotFoundException fnf) {
			System.out.println("No file");
		} catch (ClassNotFoundException cnf) {
			System.out.println("No Emp class");
		} catch (IOException exp) {
			System.out.println("IO Exception");
		}

	}
	
	@Override
	public void sortByEid() {
		Collections.sort(EmpList);
		System.out.println("After sorting by EID");
		System.out.println(EmpList);
	}

	@Override
	public void sortByEname() {
		Collections.sort(EmpList, EmployeeModel.NameComparator);
		System.out.println(EmpList);
		
	}
	
	}
	