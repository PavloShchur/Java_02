package programmingBasics;

public class CombiCar extends Airplane implements CarCargo, PessangerCar {

	private String brandOfCar;
	
	

	@Override
	public void transportPessangers() {
		System.out.println("transport some people");
	}

	@Override
	public void trasportCargo() {
		System.out.println("");
	}

	public CombiCar() {
		super();
	}

	public CombiCar(int numberOfWings) {
		super(numberOfWings);
		// TODO Auto-generated constructor stub
	}

	public String getBrandOfCar() {
		return brandOfCar;
	}

	public void setBrandOfCar(String brandOfCar) {
		this.brandOfCar = brandOfCar;
	}

	@Override
	public String toString() {
		return "CombiCar [brandOfCar=" + brandOfCar + ", getBrandOfCar()=" + getBrandOfCar() + ", getNumberOfWings()="
				+ getNumberOfWings() + "]";
	}

	@Override
	public void spinToWin() {
		// TODO Auto-generated method stub
		
	}

	public CombiCar(String brandOfCar) {
		super();
		this.brandOfCar = brandOfCar;
	}

	public CombiCar(int numberOfWings, String brandOfCar) {
		super(numberOfWings);
		this.brandOfCar = brandOfCar;
	}
	
	

}
