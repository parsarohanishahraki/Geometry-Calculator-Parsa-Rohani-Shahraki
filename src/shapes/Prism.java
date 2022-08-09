package shapes;

public abstract class Prism {
	// Instance Variables
	private double height;
	private double length;

	/**
	 * Constructor that initializes a prism object
	 * 
	 * @param height height of prism
	 * @param length length of one side of the prism
	 */
	public Prism(double height, double length) {
		setHeight(height);
		setLength(length);
	}

	/**
	 * Method to get the height of a prism
	 * 
	 * @return height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * Method to set the height of a prism
	 * 
	 * @param height
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * Method to get the length of a prism
	 * 
	 * @return
	 */
	public double getLength() {
		return length;
	}

	/**
	 * Method to set the length of a prism
	 * 
	 * @param length
	 */
	public void setLength(double length) {
		this.length = length;
	}

	/**
	 * Method to calculate base area of a prism
	 * 
	 * @return base area
	 */
	public abstract double getBaseArea();

	/**
	 * Method to calculate the volume of a prism
	 * 
	 * @return volume 
	 */
	public abstract double getVolume();

}
