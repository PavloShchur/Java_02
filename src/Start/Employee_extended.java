package Start;

public class Employee_extended {

	// this instance variable is visible for any child class

	public String name;

	// salary variable is visible in Employee class only.
	private double salary;

	// The name variable is assigned in the constructor

	public Employee_extended(String empName) {
		super();
		this.name = empName;
	}

	// The salary variable is assigned a value.

	public void setSalary(double empSal) {
		this.salary = empSal;
	}

	// This method prints the employee details

	public void printEmp() {
		System.out.println("name : " + name);
		System.out.println("salary : " + salary);
	}

	public static void main(String[] args) {
		Employee_extended empOne = new Employee_extended("Ransika");
		empOne.setSalary(800);
		empOne.printEmp();
	}

}
