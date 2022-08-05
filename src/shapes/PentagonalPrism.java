package shapes;

public class PentagonalPrism extends Prism{
	
	/**
	 * Constructor that initializes a new Pentagonal Prism
	 * @param height
	 * @param length
	 */
	public PentagonalPrism(double height, double length) {
		super(height, length);
	}

	@Override
	public double getBaseArea() {
		return (1.0/4.0) * (Math.sqrt(5 * (5+2 * Math.sqrt(5)))) * Math.pow(this.getLength(), 2);
	}

	@Override
	public double getVolume() {
		return ((1.0/4.0) * (Math.sqrt(5 * (5+2 * Math.sqrt(5)))) * Math.pow(this.getLength(), 2)) * this.getHeight();
	}

}
