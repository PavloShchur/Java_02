package Java_lang;

public class IsDemo {

	public static void main(String[] args) {
		char a[] = {'a', 'b', '5', '?', 'A', ' '};
		for (int i = 0; i < a.length; i++) {
			if(Character.isDigit(a[i]))
				System.out.println(a[i] + " - �����.");
			if(Character.isLetter(a[i]))
				System.out.println(a[i] + " - �����.");
			if(Character.isWhitespace(a[i]))
				System.out.println(a[i] + " - ��������� ������.");
			if(Character.isUpperCase(a[i]))
				System.out.println(a[i] + " - �������� �����.");
			if(Character.isLowerCase(a[i]))
				System.out.println(a[i] + " - ��������� �����.");
		}
	}

}
