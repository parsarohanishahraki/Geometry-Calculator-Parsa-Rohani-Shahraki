package shapes;

public class HexagonalPrism extends Prism {
	/**
	 * Constructor that initializes a new Hexagonal Prism
	 * 
	 * @param height
	 * @param length
	 */
	public HexagonalPrism(double height, double length) {
		super(height, length);
	}

	@Override
	public double getBaseArea() {
		return (3 * Math.sqrt(3) * (Math.pow(this.getLength(), 2) / 2));
	}

	@Override
	public double getVolume() {
		return (3 * Math.sqrt(3) * (Math.pow(this.getLength(), 2) / 2)) * this.getHeight();
	}

}
