package String;

public class equalsDemo {

	public static void main(String[] args) {
		String s1 = "Привіт";
		String s2 = "Привіт";
		String s3 = "Прощай";
		String s4 = "ПРИВІТ";
		
		System.out.println(s1 + " рівне " + s2 + " -> " + s1.equals(s2));
		System.out.println(s1 + " рівне " + s3 + " -> " + s1.equals(s3));
		System.out.println(s1 + " рівне " + s4 + " -> " + s1.equals(s4));
		System.out.println(s1 + " рівне без врахування регістру " + s4 + " -> " + s1.equalsIgnoreCase(s4));

	}

}
