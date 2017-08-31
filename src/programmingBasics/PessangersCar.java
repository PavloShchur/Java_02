package programmingBasics;

public class PessangersCar implements PessangerCar{
	
	private int umberOfCars;
	
	

	public PessangersCar() {
		super();
	}






	public PessangersCar(int umberOfCars) {
		super();
		this.umberOfCars = umberOfCars;
	}



	public int getUmberOfCars() {
		return umberOfCars;
	}



	public void setUmberOfCars(int umberOfCars) {
		this.umberOfCars = umberOfCars;
	}



	@Override
	public String toString() {
		return "PessangersCar [umberOfCars=" + umberOfCars + "]";
	}
	

	@Override
	public void transportPessangers() {
		System.out.println("transport people");
	}
}
