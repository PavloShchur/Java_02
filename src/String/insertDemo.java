package String;

public class insertDemo {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Мені Java!");
		
		sb.insert(4, " подобається ");
		System.out.println(sb);
	}

}
