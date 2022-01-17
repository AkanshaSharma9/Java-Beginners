/* 3)	Create a package named "Presidency".
 *Under this create two packages named "Employee" and "Student". 
 *Under the employee package create a class called "EmployeeDetails" having required member fields and methods. 
 *Under the Student package create a class called "StudentDetails" having required member fields and methods. 
 *Demonstrate the above by creating objects of StudentDetails and EmployeeDetails inside another class which resides in another package.
 *Hint: You can assume the relevant fields and methods to be written inside the EmployeeDetails and StudentDetails class. 
 */

package StudentEmployee.Employee;

public class EmployeeDetails {
	String name, empid, dept;
	public EmployeeDetails (String name, String empid, String dept)  {
		this.name = name;
		this.empid = empid;
		this.dept = dept;
	}
	public void empDisp()   {
		System.out.println ("name:"+name+"\nempid:"+empid+"\ndept:"+dept);
	}

}
