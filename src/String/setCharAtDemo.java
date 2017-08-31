package String;

public class setCharAtDemo {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println("Буфер до = " + sb);
		System.out.println("до виклику charAt(1) = " + sb.charAt(1));
		
		sb.setCharAt(1, 'i');
		sb.setLength(2);
		System.out.println("буфер після = " + sb);
		System.out.println("після виклику charAt(1) = " + sb.charAt(1));
	}

}
