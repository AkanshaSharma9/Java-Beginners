package StudentEmployee.Student;

public class StudentDetails {
	String name, id, branch;
	public StudentDetails(String name, String id, String branch) {	
		this.name = name;
		this.id = id;
		this.branch = branch;
	}
	public void stuDisp() {
		System.out.println ("name:"+name+"\nid:"+id+"\nbranch:"+branch);
	}

}
