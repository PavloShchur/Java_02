package String;

public class FastStringBuilder {

	public static void main(String[] args) {

		double t1 = System.currentTimeMillis();

		String r = "";
		for (int i = 0; i < 100000; i++) {
			r += String.valueOf(i) + " ";
		}

		System.out.println(r);

		double t2 = System.currentTimeMillis();

		System.out.println("concationation : " + (t2 - t1) / 1000); // 20.086

		double b1 = System.currentTimeMillis();

		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < 100000; i++) {
			stringBuilder.append(i).append(" ");
		}

		System.out.println(stringBuilder);

		double b2 = System.currentTimeMillis();

		System.out.println("stringBuilder : " + (b2 - b1) / 1000); // 0.129

	}

}
