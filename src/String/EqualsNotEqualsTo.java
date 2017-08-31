package String;

public class EqualsNotEqualsTo {

	public static void main(String[] args) {
		String s1 = "Привіт";
		String s2 = new String(s1);
		
		System.out.println(s1 + " рівне " + s2 + " -> " + s1.equals(s2));
		System.out.println(s1 + " рівне " + s2 + " -> " + s1 == s2);

	}

}
