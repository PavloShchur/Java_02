package Java_lang;

public class CloneDemo {

	public static void main(String[] args) {
		TestClone x1 = new TestClone();
		TestClone x2 = x1.cloneTest();
		
		x1.a = 10;
		x2.b = 20.98;
		x2 = (TestClone) x1.cloneTest();
		System.out.println("x1: " + x1.a + " " + x1.b);
		System.out.println("x2: " + x2.a + " " + x2.b);

	}

}
