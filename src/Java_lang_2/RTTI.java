package Java_lang_2;

public class RTTI {

	public static void main(String[] args) {
		X x = new X();
		Y y = new Y();
		Class<?> clObj;
		clObj = x.getClass();
		System.out.println("x - ���� ����: " + clObj.getName());
		clObj = y.getClass();
		System.out.println("y - ���� ����: " + clObj.getName());
		clObj = clObj.getSuperclass();
		System.out.println("�������� ����� y: " + clObj.getName());

	}

}
