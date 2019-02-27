//PermanentEmployee:name, age, employeeId, salary
public class PermanentEmployee extends Employee{

	private int salary;

	public PermanentEmployee(String name, int age, int employeeId, int salary){

		super(name,age,employeeId);
		this.salary = salary;
	}

	public void printDetails(){

		super.printDetails();
		System.out.println("salary: "+salary);
	}
}