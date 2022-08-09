package shapes;

public class EnneagonalPrism extends Prism {
	/**
	 * Constructor that initializes the Enneagonal Prism
	 * 
	 * @param height height of the prism
	 * @param length length of one side of the prism
	 */
	public EnneagonalPrism(double height, double length) {
		super(height, length);
	}

	@Override
	public double getBaseArea() {
		double rads = Math.toRadians(20);
		double cotan = 1.0 / Math.tan(rads);
		return (9.0 / 4.0) * Math.pow(this.getLength(), 2) * cotan;
	}

	@Override
	public double getVolume() {
		double rads = Math.toRadians(20);
		double cotan = 1.0 / Math.tan(rads);
		return ((9.0 / 4.0) * Math.pow(this.getLength(), 2) * cotan) * this.getHeight();
	}

}