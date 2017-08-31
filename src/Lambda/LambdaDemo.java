package Lambda;

public class LambdaDemo {

	public static void main(String[] args) {
		MyNember myNember;
		
		myNember = () -> 123.45;
		
		System.out.println("Фіксоване значення: " + myNember.getValue());
		
		myNember = () -> Math.random() * 100;
		System.out.println("Випадкове значення: " + myNember.getValue());
		System.out.println("Ще одне випадкове значення: " + myNember.getValue());
		
		
		
	}

}
