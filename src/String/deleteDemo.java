package String;

public class deleteDemo {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("�� ������� ����");
		
		sb.delete(3, 11);
		System.out.println("ϳ��� ������� delete(): " + sb);
		
		sb.deleteCharAt(0);
		System.out.println("ϳ��� ������� deleteCharAt(): " + sb);
	}

}
