public class Person {

    String name;
    int age;

    public Person(String n, int a) {
        name = n;
        age = a;
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
//Teacher:name, age, faculty
//Employee:name, age, employeeId, 
//PermanentEmployee:name, age, employeeId, salary
//ContractEmployee: name, age, employeeId, payment
