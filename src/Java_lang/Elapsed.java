package Java_lang;

public class Elapsed {

	public static void main(String[] args) {
		long start, end = 0;
		
		System.out.println("���������� ���� �������� �� 0 �� 100000000");
		
		start = System.currentTimeMillis();
		for (int i = 0; i < 1000000000; i++)
		end = System.currentTimeMillis();
		
		System.out.println("��� ���������: " + (end-start));
	}

}
