package programmingBasics;

public interface Wheels {
	
	int numberOfWheels = 4;
	
	void spinToWin();
	
	default void superCar(){
		System.out.println("I anm optumis pryme");
	}
	
}
