package Lambda;

public class BlockLambdaDemo2 {

	public static void main(String[] args) {
		StringFunc reverse = str -> {
			String result = "";
			int i;

			for (i = str.length() - 1; i >= 0; i--)
				result += str.charAt(i);
			return result;
		};
		System.out.println("Ëÿלבכא ןונועגמנ‏÷עüסÿ םא " + reverse.func("Ëÿלבהא"));
		System.out.println("Âטנאח ןונועגמנ‏÷עüסÿ םא " + reverse.func("Âטנאח"));

	}

}
