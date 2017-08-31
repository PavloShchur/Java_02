package Start;

public class Puppy_extended {
	int puppyAge;

	public Puppy_extended(String name) {
		// This constructor gas one parameter, name
		System.out.println("Name chosen is : " + name);
	}

	public Puppy_extended(int puppyAge) {
		super();
		this.puppyAge = puppyAge;
	}

	public int getPuppyAge() {
		System.out.println("Puppy's age is :" + puppyAge);
		return puppyAge;
	}

	public void setPuppyAge(int age) {
		puppyAge = age;
	}
	public static void main(String[] args) {
		
		/*Object creation*/
		
		Puppy_extended myPuppy = new Puppy_extended("tommy");
		
		/*Call class method to set puppy's age*/
		
		myPuppy.setPuppyAge(2);
		
		/*Call another class method to get puppy's age*/
		
		myPuppy.getPuppyAge();
		
		/*You can access instance variable as follows as well*/
		System.out.println("Variable Value :" + myPuppy.getPuppyAge());
		
	}

}
