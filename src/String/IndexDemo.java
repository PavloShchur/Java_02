package String;

public class IndexDemo {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("one two one");
		int i;

		i = sb.indexOf("one");
		System.out.println("Індекс першого входження: " + i);
		
		i = sb.lastIndexOf("one");
		System.out.println("Індекс останнього входження: " + i);

	}

}
