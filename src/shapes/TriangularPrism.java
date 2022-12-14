package shapes;

public class TriangularPrism extends Prism {

	/**
	 * Constructor that initializes a new Triangular prism
	 * 
	 * @param height height of prism
	 * @param length length of one side of the prism
	 */
	public TriangularPrism(double height, double length) {
		super(height, length);
	}

	@Override
	public double getBaseArea() {
		return ((Math.pow(this.getLength(), 2) * Math.sqrt(3)) / 4.0);
	}

	@Override
	public double getVolume() {
		return (((Math.pow(this.getLength(), 2) * Math.sqrt(3)) / 4.0) * this.getHeight());
	}

}
