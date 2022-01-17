package Demo;
import java.util.Scanner;

import StudentEmployee.Employee.EmployeeDetails;
import StudentEmployee.Student.StudentDetails;

public class PackageDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter employee details");
		System.out.println("enter name of employee");
		String ename=sc.next();
		System.out.println("enter employee id");
		String eid=sc.next();
		System.out.println("enter employee department");
		String dept=sc.next();
		EmployeeDetails e=new EmployeeDetails(ename,eid,dept);
		System.out.println("enter student details");
		System.out.println("enter name of student");
		String name=sc.next();	
		System.out.println("enter student id");
		String id=sc.next();
		System.out.println("enter branch of a student");
		String branch=sc.next();
		StudentDetails s=new StudentDetails(name,id,branch);
		e.empDisp();
		s.stuDisp();
	}

}
