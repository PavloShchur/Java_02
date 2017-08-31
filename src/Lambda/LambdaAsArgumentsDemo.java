package Lambda;

public class LambdaAsArgumentsDemo {
	static String stringOp(StringFunc sf, String s) {
		return sf.func(s);
	}

	public static void main(String[] args) {
			
		String inStr = "Ћ€мбда-вирази п≥двищують ефективн≥сть Java";
		String outStr;
		
		System.out.println("÷е вих≥дна точка: " + inStr);
		outStr = stringOp((str) -> str.toUpperCase(), inStr);
		System.out.println("÷€ стр≥чка в верхньому рег≥стр≥: " + outStr);
		
		outStr = stringOp((str) -> {
			String result = "";
			int i;
			for (i = 0; i < str.length(); i++)
				if(str.charAt(i) != ' ')
					result += str.charAt(i);
			return result;
		}, inStr);
		System.out.println("÷€ стр≥чка з видаленими проб≥лами; " + outStr);
			StringFunc reverse = str -> {
			String result = "";
			int i;
			for ( i = str.length() - 1; i >=0; i--) 
				result += str.charAt(i);
			return result;
			};
			
			System.out.println("÷е перетворена стр≥чка: " + stringOp(reverse, inStr));
}
	}
