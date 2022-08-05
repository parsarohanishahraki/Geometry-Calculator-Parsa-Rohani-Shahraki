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
		double rads = Math.toRadians(180.0 / 7.0);
		double cotan = 1.0 / Math.tan(rads);
		return (7.0 / 4.0) * Math.pow(this.getLength(), 2) * cotan;
	}

	@Override
	public double getVolume() {
		double rads = Math.toRadians(180.0 / 7.0);
		double cotan = 1.0 / Math.tan(rads);
		return ((7.0 / 4.0) * Math.pow(this.getLength(), 2) * cotan) * this.getHeight();
	}

}