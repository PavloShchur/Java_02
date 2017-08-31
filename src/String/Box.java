package String;

public class Box {
	double widht;
	double height;
	double depth;
	public Box(double widht, double height, double depth) {
		super();
		this.widht = widht;
		this.height = height;
		this.depth = depth;
	}
	@Override
	public String toString() {
		return "Box [widht=" + widht + ", height=" + height + ", depth=" + depth + "]";
	}
	
}
