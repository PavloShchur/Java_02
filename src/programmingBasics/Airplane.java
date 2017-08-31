package programmingBasics;

public class Airplane   {
		
	private int numberOfWings = 2;

	public Airplane() {
		super();
	}

	public Airplane(int numberOfWings) {
		super();
		this.numberOfWings = numberOfWings;
	}

	public int getNumberOfWings() {
		return numberOfWings;
	}

	public void setNumberOfWings(int numberOfWings) {
		this.numberOfWings = numberOfWings;
	}

	@Override
	public String toString() {
		return "Airplane [numberOfWings=" + numberOfWings + "]";
	}
	
	
		
}
