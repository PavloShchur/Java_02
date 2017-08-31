package Java_lang;

public class TestClone implements Cloneable {
	int a;
	double b;

	public TestClone cloneTest() {
		try {
			return (TestClone) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("Клонування не можливе.");
			return this;
		}

	}

}
