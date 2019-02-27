//Employee:name, age, employeeId, 
public class Employee extends Person {

	private int employeeId;

	public Employee(String name, int age, int employeeId){

		super(name,age);
		this.employeeId = employeeId;
	}

	public void printDetails(){

		super.printDetails();
		System.out.println("employeeId : "+employeeId);
	}

	

}