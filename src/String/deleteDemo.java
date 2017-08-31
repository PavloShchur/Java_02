package String;

public class deleteDemo {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Це простий тест");
		
		sb.delete(3, 11);
		System.out.println("Після виклики delete(): " + sb);
		
		sb.deleteCharAt(0);
		System.out.println("Після виклики deleteCharAt(): " + sb);
	}

}
