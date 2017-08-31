package Lambda;

public class BlockLambdaDemo {

	public static void main(String[] args) {
		NumericFunc factorial = n -> {
			int result = 1;
			for (int i = 1; i <= n; i++) 
				result = i * result;
				return result;
			};
			System.out.println("Факторіал числа 3 рівен: " + factorial.func(3));
			System.out.println("Факторіал числа 5 рівен: " + factorial.func(5));

	}

}
