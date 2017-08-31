package programmingBasics;

public class CargoCar implements CarCargo, Wheels {
	
	private String type;
	
	public CargoCar() {
		super();
	}

	public CargoCar(String type) {
		super();
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "CargoCar [type=" + type + "]";
	}
	
	@Override
	public void trasportCargo() {
		System.out.println("transport some cargo");
	}

	@Override
	public void spinToWin() {
		System.out.println("SPIN TO WIN");
	}
}
