package Start;

public class FreshJuiceTest {

	public static void main(String[] args) {
		FreshJuice juice = new FreshJuice();
		juice.size = FreshJuice.FreshJuicsSize.MEDIUM;
		System.out.println("Size: " + juice.size);
	}

}
