package Start;

public class EmployeeTest {

	public static void main(String[] args) {
		/*Create two objects using constructors*/
		
		Employee empOne = new Employee("James Smith");
		Employee empTwo = new Employee("Mary Anne");
		
		//Invoking methods for each object created
		
		empOne.empAge(26);
		empOne.empDesigntion("Senior Software Engineer");
		empOne.empSalary(1000);
		empOne.printEmployee();
		
		empTwo.empAge(21);
		empTwo.empDesigntion("Software Engineer");
		empTwo.empSalary(500);
		empTwo.printEmployee();
		
	}

}
