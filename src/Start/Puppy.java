package Start;

public class Puppy {
	public Puppy(String name) {
		// this constructor has one parameter, name.
		System.out.println("passed name is : " + name);
	}

	public static void main(String[] args) {
		// Following statement would create an object myPuppy
		Puppy myPuppy = new Puppy("tommy");
	}

}
