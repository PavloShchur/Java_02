package Lambda;

import java.util.function.Function;

public class UseFunctionInterfaceDemo {

	public static void main(String[] args) {
		Function<Integer, Integer> factorial = n -> {
			int result = 1;
			for (int i = 1; i <= n; i++)
				result = i * result;
			return result;
		};
		System.out.println("Факторіа числа 3 складає " + factorial.apply(3));
		System.out.println("Факторіа числа 5 складає " + factorial.apply(5));

	}

}
