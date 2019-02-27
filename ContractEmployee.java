//ContractEmployee: name, age, employeeId, payment
public class ContractEmployee extends Employee{

	private int payment;

	public ContractEmployee(String name, int age, int employeeId, int payment){

		super(name,age,employeeId);
		this.payment = payment;
	}

	public void printDetails(){

		super.printDetails();
		System.out.println("payment : " + payment);
	}


}