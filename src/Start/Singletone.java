package Start;

public class Singletone {
	
	private static Singletone singletone = new Singletone();
	
	/* A private Constructor prevents any other
	 * class from instantiating.
	 * */

	

	Singletone () {}
	
	/*Static 'instance' method*/
	
	public static Singletone getInstance () {
		return singletone;
	}
		
		/*Other methods protected by singleton-ness*/
		
		protected void demoMethod() {
			System.out.println("demoMethod for singleton");

	}
}
