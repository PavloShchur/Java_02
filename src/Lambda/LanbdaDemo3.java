package Lambda;

public class LanbdaDemo3 {

	public static void main(String[] args) {
		NumericTest2 isFactor = (n, d) -> (n % d) == 0;
		
		if(isFactor.test(10, 2)) 
			System.out.println("����� 2 � ��������� ����� 10");
		
		if(!isFactor.test(10, 3)) 
			System.out.println("����� 2 �� � ��������� ����� 10");
	}

}
