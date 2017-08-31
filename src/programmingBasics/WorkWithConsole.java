package programmingBasics;

import java.util.Date;

public class WorkWithConsole {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 7;
		
		System.out.printf("\"a\" = %5d\nb = %5d\n", a, b);
				
		String name = "Sergey";
		String f = String.format("Hello, %s!", name);
		System.out.println(f);
		
		double d = 5D / 2;
		double d2 = 1.5;
		System.out.printf("d = %2$10.2f\nd2 = %1$f\n", d, d2);
		System.out.println();
		Date date = new Date();
		System.out.printf("%1$tY-%1$tB-%1$td", date);
		
		
	}
	
}
















