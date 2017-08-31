package String;

public class indexOfDemo {

	public static void main(String[] args) {
		String s = "Now is the tome for all good men to come to the aid of their counjtry";
		System.out.println(s);
		System.out.println("indexOf(t) = " + s.indexOf('t'));
		System.out.println("lastindexOf(t) = " + s.lastIndexOf('t'));
		System.out.println("indexOf(the) = " + s.indexOf("the"));
		System.out.println("lastindexOf(the) = " + s.lastIndexOf("the"));
		System.out.println("indexOf(t, 10) = " + s.indexOf('t', 10));
		System.out.println("lastindexOf(t, 60) = " + s.lastIndexOf('t', 60));
		System.out.println("indexOf(the, 10) = " + s.indexOf("the", 10));
		System.out.println("lastindexOf(the, 60) = " + s.lastIndexOf("the", 60));







	}

}
