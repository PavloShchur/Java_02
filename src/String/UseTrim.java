package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UseTrim {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		System.out.println("������ '����' ��� ����������.");
		System.out.println("������ ����� �����.");
		do {
			str = br.readLine();
			str = str.trim();
			if (str.equals("��������"))
				System.out.println("������� - ���������");
			else if (str.equals("̳����"))
				System.out.println("������� - ���������-��");
			else if (str.equals("��������"))
				System.out.println("������� - ����������.");
			else if (str.equals("���������"))
				System.out.println("������� - �����");
		} while (str.equals("����"));

	}
}
