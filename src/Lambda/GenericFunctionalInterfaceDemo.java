package Lambda;

public class GenericFunctionalInterfaceDemo {

	public static void main(String[] args) {
		SomeFunc<String> reverse = str -> {
			String result = "";
			int i;

			for (i = str.length() - 1; i >= 0; i--)
				result += str.charAt(i);
			return result;
		};
		System.out.println("Лямбда перетворюється на " + reverse.func("Лямбда"));
		System.out.println("Вираз перетворюєть на " + reverse.func("Вираз"));

		SomeFunc<Integer> factorial = n -> {
			int result = 1;

			for (int i = 1; i <= n; i++)
				result = i * result;
			return result;
		};
		System.out.println("Факторіад числа 3 рівний " + factorial.func(3));
		System.out.println("Факторіад числа 5 рівний " + factorial.func(5));

	}

}
