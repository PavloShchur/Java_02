package Java_lang;

public class ExecDemo {

	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();
		Process p = null;
		try {
			p = r.exec("Notepad");
		} catch (Exception e) {
			System.out.println("Помилка запуску Notepad.");
		}
	}

}
