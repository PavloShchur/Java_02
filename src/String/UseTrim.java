package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UseTrim {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		System.out.println("Введіть 'стоп' для завершення.");
		System.out.println("Введіть назву штату.");
		do {
			str = br.readLine();
			str = str.trim();
			if (str.equals("Ільлінойс"))
				System.out.println("Столиця - Спрінгфілд");
			else if (str.equals("Міссурі"))
				System.out.println("Столиця - Джеферсон-сіті");
			else if (str.equals("Каліфорнія"))
				System.out.println("Столиця - Сакраменто.");
			else if (str.equals("Вашингтон"))
				System.out.println("Столиця - Олімпія");
		} while (str.equals("стоп"));

	}
}
