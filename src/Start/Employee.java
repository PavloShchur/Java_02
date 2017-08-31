package Start;

public class Employee {

	String name;
	int age;
	String designation;
	double salary;

	// This is constructor of class employee

	public Employee(String name) {
		super();
		this.name = name;
	}

	// Assign the age of Employee to the variable age.

	public void empAge(int empAge) {
		age = empAge;
	}
	/* Assign the designation to the variable designation */

	public void empDesigntion(String empDesig) {
		designation = empDesig;
	}

	/* Assign the salary to the variable salary */

	public void empSalary(double empSalary) {
		salary = empSalary;
	}

	/* Print the Employee details */

	public void printEmployee() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Designation: " + designation);
		System.out.println("Salary: " + salary);
	}

}
