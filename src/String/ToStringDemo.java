package String;

public class ToStringDemo {

	public static void main(String[] args) {
		Box b = new Box(10, 12, 14);
		String s = "ќбЇкт b типу Box: " + b;
		
		System.out.println(b);
		System.out.println(s);
	}

}
