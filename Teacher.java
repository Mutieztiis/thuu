//Teacher:name, age, faculty
public class Teacher extends Person{
	private String faculty;

	public Teacher(String name, int age, String faculty){

		super(name,age);
		this.faculty = faculty;
	}

	public void printDetails(){
		super.printDetails();
		System.out.println("faculty: "+faculty);
	}
}