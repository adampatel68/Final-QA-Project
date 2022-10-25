package com.qa.ecommerce;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.ecommerce.pojo.user;

@RestController
public class LearningAPI {
	user User2 = new user("Em", null, null, null, null, null);
	user User3 = new user("Mohammed", null, null, null, null, null);

	@RequestMapping("/user")
	public user user() {
		// return user3.getName(); - RETURN TYPE MUST BE STRING
		// return new user(1001, "Adam"); - CREATING USER + RETURN: ALL IN ONE LINE
		return User3;
	}

	@RequestMapping("/multipleUsers")
	public List<user> multipleUser() {

		user User4 = new user("Lucy", null, null, null, null, null);
		user User5 = new user("Frank", null, null, null, null, null);
		user User6 = new user("Ross", null, null, null, null, null);

		List<user> userList = new ArrayList<user>();
		// We're making a list [LIST], <with this type of data [USER]>, the list will be
		// called this [USERS], = new ArratList<type of data [USER]>();

		userList.add(User4);
		userList.add(User5);
		userList.add(User6);

		return userList;

	}
	// ============================== COMMENTS ============================== //
	// http://localhost:8081/message - Writing this message in the web will print
	// out the message
	// http://127.0.0.1:8081/message - this will do the same thing
	// 127.0.0.1 = local host
	// The number 8081 comes from "Tomcat initialized with port(s): 8081 (http)"
	// To change the port number, go to file 'application.properties', located in
	// source resources and type: server.port = **** with the new number

	// SprintBoot DevTools - after adding this new dependency, the code will restart
	// itself after you alter it
	// Before this dependency was added, you had to manually stop the code and
	// restart it
	// ============================== COMMENTS ============================== //

	public class Student {
		int ID;
		String Name;

		String DOB;
		String Gender;
		String Address;

		public Student() {

		}

		public Student(int iD, String name, String dOB, String gender, String address) {
			super();
			ID = iD;
			Name = name;
			DOB = dOB;
			Gender = gender;
			Address = address;
		}

		public int getID() {
			return ID;
		}

		public void setID(int iD) {
			ID = iD;
		}

		public String getName() {
			return Name;
		}

		public void setName(String name) {
			Name = name;
		}

		public String getDOB() {
			return DOB;
		}

		public void setDOB(String dOB) {
			DOB = dOB;
		}

		public String getGender() {
			return Gender;
		}

		public void setGender(String gender) {
			Gender = gender;
		}

		public String getAddress() {
			return Address;
		}

		public void setAddress(String address) {
			Address = address;
		}

	}

	//
	// THIS WILL PRINT OUT ALL THE DATA IN THE TABLE 'STUDENTS'
	//

	@RequestMapping("/getDBStudents")
	public List<Student> getDBStudents() throws Exception {
		// Return type [LIST<USERS>], then write the method name() ... {}

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(
				"jdbc:mysql://localhost/afterschoolclub?useTimezone=true&serverTimezone=UTC", "root", "username1479");

		PreparedStatement pstmt = conn.prepareStatement("select * from Student");

		ResultSet rs = pstmt.executeQuery();

		List<Student> Students = new ArrayList<Student>();

		while (rs.next()) {

			int ID = rs.getInt(1);
			String Name = rs.getString(2);
			String DOB = rs.getString(3);
			String Gender = rs.getString(4);
			String Address = rs.getString(5);
			// IF ANY PROPERITES OF A VARIABLE ARE MISSING, WRITE NULL IN PLAVE OF IT

			Student NewStudent = new Student(ID, Name, DOB, Gender, Address); // THIS LINE SHOULD BE IN THE SAME ORDER
																				// AS THE TOP, ELSE INFO WILL BE SWAPPED
																				// ARROUND
			// Student NewStudent = new Student(ID, Name, null, Gender, null); - THIS WILL
			// PRINT NULL IN THOSE 2 PLACES
			// Student NewStudent = new Student(ID, Name, DOB, "MALE", Address); - This will
			// print MALE in every gender place

			Students.add(NewStudent);

		}

		return Students;
	}

}
