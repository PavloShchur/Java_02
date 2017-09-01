package Generic;

public class SimpleGeneric<T> {

	private final T left;
	private final T right;

	public SimpleGeneric(final T left, final T right) {
		this.left = left;
		this.right = right;
	}
	
	public T getLeft() {
		return left;
	}
	
	public T hetRight() {
		return right;
	}

}
