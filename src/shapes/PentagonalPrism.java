package shapes;

public class PentagonalPrism extends Prism {

	/**
	 * Constructor that initializes a new Pentagonal Prism
	 * 
	 * @param height height of the prism
	 * @param length length of one side of the prism
	 */
	public PentagonalPrism(double height, double length) {
		super(height, length);
	}

	@Override
	public double getBaseArea() {
		return (1.0 / 4.0) * (Math.sqrt(5 * (5 + 2 * Math.sqrt(5)))) * Math.pow(this.getLength(), 2);
	}

	@Override
	public double getVolume() {
		return ((1.0 / 4.0) * (Math.sqrt(5 * (5 + 2 * Math.sqrt(5)))) * Math.pow(this.getLength(), 2))
				* this.getHeight();
	}

}
