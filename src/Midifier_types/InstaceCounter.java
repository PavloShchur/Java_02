package Midifier_types;

public class InstaceCounter {
	
	private static int numInstances = 0;
	
	protected static int  getCount() {
		return numInstances;
	}
	
	private static void addInstance() {
		numInstances++;
	}

	public InstaceCounter() {
		InstaceCounter.addInstance();
	}
	
	public static void main(String[] args) {

		System.out.println("Starting with " + InstaceCounter.getCount() + " instances.");
		
		for (int i = 0; i < 500; i++) {
			
			new InstaceCounter();
		}
		
		System.out.println("Cerated " + InstaceCounter.getCount() + " instances.");
	}

}
