import java.util.*;
public class PersonMain{
	
	public static void main(String[] args) {

		Person p;
		Teacher th;
		Employee em;
		PermanentEmployee pe;
		ContractEmployee ce;

		ArrayList<Person> arrPerson;

		p = new Person("Abb",24);
		th = new Teacher("Nim",25,"coe");
		em = new Employee("Sa",24,10000);
		pe = new PermanentEmployee("Drag",34,20000,24000);
		ce = new ContractEmployee("Dong",44,34000,34555);

		arrPerson=new ArrayList<Person>();
   
   arrPerson.add(p);
   arrPerson.add(em);
   arrPerson.add(th);
   arrPerson.add(ce);
   arrPerson.add(pe);
   System.out.println("size="+arrPerson.size());
   
    for (Person pp: arrPerson){
    
      pp.printDetails();
      System.out.println();




		}
	}
}