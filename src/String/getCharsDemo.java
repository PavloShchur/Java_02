package String;

public class getCharsDemo {

	public static void main(String[] args) {
		String s = "�� ������������ ������ getChars().";
		int start = 3;
		int end = 7;
		char buf[] = new char[end - start];
		s.getChars(start, end, buf, 0);
		System.out.println(buf);
		
	}

}
