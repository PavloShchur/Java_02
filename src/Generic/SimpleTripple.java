package Generic;

public class SimpleTripple<T> extends SimpleGenericManyTypes2<T, T>{
			
	private final T middle;

	public SimpleTripple(final T left, final T right, final T middle) {
		super(left, right);
		this.middle = middle;
	}
	
	public T getMiddle() {
		return middle;
	}
	
	public static void main(String[] args) {
		SimpleTripple<Integer, Integer, Integer> simpleTripple =
				new SimpleTripple<Integer, Integer, Integer>(15, 20, 30);
		System.out.println(simpleTripple.getMiddle());
	}
	
	
}
