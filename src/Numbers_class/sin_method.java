package Numbers_class;

public class sin_method {

	public static void main(String[] args) {
		double degrees = 45.0;
		double radians = Math.toRadians(degrees);
		
		System.out.format("The value of pi is %.4f%n", Math.PI);
		System.out.format("The sine of %.1f degrees is %.4f%n", degrees, Math.sin(radians));

	}

}
