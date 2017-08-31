package Lambda;

public class BlockLambdaDemo {

	public static void main(String[] args) {
		NumericFunc factorial = n -> {
			int result = 1;
			for (int i = 1; i <= n; i++) 
				result = i * result;
				return result;
			};
			System.out.println("�������� ����� 3 ����: " + factorial.func(3));
			System.out.println("�������� ����� 5 ����: " + factorial.func(5));

	}

}
