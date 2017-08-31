package String;

public class replaceDemo {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Це простий тест.");
		sb.replace(3, 10, "був");
		System.out.println("Після заміни: " + sb);
	}

}
