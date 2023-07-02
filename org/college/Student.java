package org.college;

public class Student extends Department {
	
	public void studentName() {
		
		System.out.println("Name : vinu");
		
	}
	
	public void studentDepartment() {
		
		System.out.println("Department : CSE");
		
	}
	
	public void studentId() {
		
		System.out.println("ID No : 056");
		
	}
	
	public static void main(String[] args) {
		
		Student std = new Student();
		
		std.collegeName();
		std.collegeCode();
		std.collegeRank();
		std.departmentName();
		std.studentName();
		std.studentDepartment();
		std.studentId();
		

	}

}
