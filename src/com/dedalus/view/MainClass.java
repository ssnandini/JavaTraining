package com.dedalus.view;

import java.util.Scanner;
import java.io.*;
import com.dedalus.Exception.*;
import com.dedalus.controlller.*;
import com.dedalus.controlller.EmployeeController;
//import java.io.*;

public class MainClass {

	public static void main(String[] args) throws IOException {

		try {

			EmpInterface ec = new EmployeeController();
			Scanner sc = new Scanner(System.in);
			String choice = null;
			String uname = null;
			String pwd = null;
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			System.out.println("Enter Username:");
			uname = br.readLine();
			System.out.println("Enter password:");
			pwd = br.readLine();

			if (uname.equals("siva") && pwd.equals("pass")) {
				System.out.println("Welcome " + uname);

				do {
					System.out.println("Enter your choice");
					System.out.println("1. Add Employee");
					System.out.println("2. View Employee");
					System.out.println("3. Serialise Employee");
					System.out.println("4. DeSerialise Employee");
					System.out.println("5. Sort Emp by ID");
					System.out.println("6. Sort by Emp name");

					int ch = sc.nextInt();
					switch (ch) {
					case 1: {
						ec.addEmployee();
						break;
					}

					case 2: {
						ec.viewEmployee();
						break;
					}

					case 3: {
						ec.serialiseEmployee();
						break;
					}

					case 4: {
						ec.deserialiseEmployee();
						break;
					}

					case 5: {
						ec.sortByEid();
						break;
					}
					case 6: {
						ec.sortByEname();
						break;
					}

					default: {
						System.out.println("Enter right choice");
						break;
					}
					}
					System.out.println("Do u want to continue Y or y");

					choice = sc.next();

				} while (choice.equals("Y") || choice.equals("y"));
				System.out.println("Exited");
				System.exit(0);
				sc.close();

			} else {
				throw new UserNotFoundException();
			}
		} catch (UserNotFoundException unf) {
			System.out.println("ssn");
		}

	}

}
