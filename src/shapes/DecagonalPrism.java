package shapes;

public class DecagonalPrism extends Prism {
	/**
	 * Constructor that initializes the Decagonal Prism
	 * 
	 * @param height height of the prism
	 * @param length length of one side of the prism
	 */
	public DecagonalPrism(double height, double length) {
		super(height, length);
	}

	@Override
	public double getBaseArea() {
		return (5.0 / 2.0) * Math.pow(this.getLength(), 2) * (Math.sqrt(5 + 2 * Math.sqrt(5)));
	}

	@Override
	public double getVolume() {
		return ((5.0 / 2.0) * Math.pow(this.getLength(), 2) * (Math.sqrt(5 + 2 * Math.sqrt(5)))) * this.getHeight();
	}

}
