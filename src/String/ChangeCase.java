package String;

public class ChangeCase {

	public static void main(String[] args) {
		String s = "Це тест.";
		System.out.println("Превинна стрічка: " + s);
		String upper = s.toUpperCase();
		String lower = s.toLowerCase();
		System.out.println("Верхній регістр: " + upper);
		System.out.println("Нижній регістр: " + lower);

	}

}
