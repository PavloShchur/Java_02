package String;

public class replaceDemo {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("�� ������� ����.");
		sb.replace(3, 10, "���");
		System.out.println("ϳ��� �����: " + sb);
	}

}
