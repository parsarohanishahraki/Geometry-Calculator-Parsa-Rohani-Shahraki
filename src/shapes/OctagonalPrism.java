package shapes;

public class OctagonalPrism extends Prism {
	/**
	 * Constructor that initializes the octagonal prism
	 * 
	 * @param height of the prism
	 * @param length of one side of the prism
	 */
	public OctagonalPrism(double height, double length) {
		super(height, length);
	}

	@Override
	public double getBaseArea() {
		return (2 * (1 + Math.sqrt(2)) * Math.pow(this.getLength(), 2));
	}

	@Override
	public double getVolume() {
		return (2 * (1 + Math.sqrt(2)) * Math.pow(this.getLength(), 2)) * this.getHeight();
	}

}
