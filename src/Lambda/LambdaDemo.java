package Lambda;

public class LambdaDemo {

	public static void main(String[] args) {
		MyNember myNember;
		
		myNember = () -> 123.45;
		
		System.out.println("Գ������� ��������: " + myNember.getValue());
		
		myNember = () -> Math.random() * 100;
		System.out.println("��������� ��������: " + myNember.getValue());
		System.out.println("�� ���� ��������� ��������: " + myNember.getValue());
		
		
		
	}

}
