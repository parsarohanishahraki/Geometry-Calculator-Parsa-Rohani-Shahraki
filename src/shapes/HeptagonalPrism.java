package shapes;

public class HeptagonalPrism extends Prism {
	/**
	 * Constructor that initializes the Heptagonal Prism
	 * 
	 * @param height
	 * @param length
	 */
	public HeptagonalPrism(double height, double length) {
		super(height, length);
	}

	@Override
	public double getBaseArea() {
		// Math.cos(180/7) / Math.sin(180/7)
		int degs = 180;
		double rads = Math.toRadians(degs);
		double coTan = 1.0 / rads;
		return (7.0 / 4.0) * Math.pow(this.getLength(), 2) * (2.07652139);
	}

	@Override
	public double getVolume() {
		return ((7.0 / 4.0) * Math.pow(this.getLength(), 2) * (2.07652139)) * this.getHeight();
	}

}
