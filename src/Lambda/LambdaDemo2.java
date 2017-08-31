package Lambda;

public class LambdaDemo2 {

	public static void main(String[] args) {
		NumericTest isEven = n -> (n % 2) == 0;
		if(isEven.test(10)) System.out.println("����� 10 �����");
		if(!isEven.test(9)) System.out.println("����� 9 �������");
		
		NumericTest isNonNegative =  n -> n>= 0;
		if(isNonNegative.test(1)) System.out.println("����� 1 ������");
		if(isNonNegative.test(-1)) System.out.println("����� -1 �����");

	}

}
