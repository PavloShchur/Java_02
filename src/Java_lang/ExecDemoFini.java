package Java_lang;

public class ExecDemoFini {

	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();
		Process p = null;
		
		try {
			p = r.exec("Notepad");
			p.waitFor();
		} catch (Exception e) {
			System.out.println("������� ������� Notepad.");
		}
		System.out.println("Notepad �������� " + p.exitValue());
	}

}
