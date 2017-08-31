package programmingBasics;

public class Main {

	public static void main(String[] args) {
		CargoCar cargoCar = new CargoCar("sedan");
		System.out.println(cargoCar);
		cargoCar.trasportCargo();
		System.out.println(cargoCar.CAR_SPEEED);
		cargoCar.spinToWin();
		System.out.println(cargoCar.numberOfWheels);
		cargoCar.superCar();
		
		System.out.println();
		
		PessangersCar pessangersCar = new PessangersCar(50);
		System.out.println(pessangersCar);
		pessangersCar.transportPessangers();
		System.out.println(pessangersCar.CAR_SPEED);
		
		System.out.println();
		
		CombiCar combiCar = new CombiCar(3, "volga");
		combiCar.spinToWin();
		combiCar.transportPessangers();
		combiCar.trasportCargo();
		System.out.println(combiCar);
		System.out.println(combiCar.CAR_SPEED);
		System.out.println(cargoCar.CAR_SPEEED);
		System.out.println(combiCar.numberOfWheels);
	}

}
