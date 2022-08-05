package shapes;

public class SquarePrism extends Prism {

	/**
	 * Constructor that initializes a new Square Prism
	 * @param height
	 * @param length
	 */
	public SquarePrism(double height, double length) {
		super(height, length);
	}

	@Override
	public double getBaseArea() {
		return Math.pow(this.getLength(), 2);
	}

	@Override
	public double getVolume() {
		return (Math.pow(this.getLength(), 2) * this.getHeight());
	}

}
