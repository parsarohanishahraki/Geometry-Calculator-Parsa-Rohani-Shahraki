package test;
import org.junit.Test;
import static org.junit.Assert.*;
import shapes.*;
public class PrismsTest {
	private static final double DELTA = 1e-15;
	@Test
	public void testTriangularPrism() {
		TriangularPrism tri = new TriangularPrism(10,3);
		double expectedArea = 3.8971143170299736;
		double expectedVolume = 38.97114317029973;
		assertEquals(expectedArea, tri.getBaseArea(), DELTA);
		assertEquals(expectedVolume, tri.getVolume(), DELTA);
	}
	@Test
	public void testTetragonalPrism() {
		SquarePrism tetra = new SquarePrism(10,3);
		double expectedArea = 9.0;
		double expectedVolume = 90.0;
		assertEquals(expectedArea, tetra.getBaseArea(), DELTA);
		assertEquals(expectedVolume, tetra.getVolume(), DELTA);
	}
	@Test
	public void testPentagonalPrism() {
		PentagonalPrism penta = new PentagonalPrism(10,3);
		double expectedArea = 15.484296605300703;
		double expectedVolume = 154.84296605300702;
		assertEquals(expectedArea, penta.getBaseArea(), DELTA);
		assertEquals(expectedVolume, penta.getVolume(), DELTA);
	}
	@Test
	public void testHexagonalPrism() {
		HexagonalPrism hexa = new HexagonalPrism(10,3);
		double expectedArea = 23.382685902179844;
		double expectedVolume = 233.82685902179844;
		assertEquals(expectedArea, hexa.getBaseArea(), DELTA);
		assertEquals(expectedVolume, hexa.getVolume(), DELTA);
	}
	@Test
	public void testHeptagonalPrism() {
		HeptagonalPrism hepta = new HeptagonalPrism(10,3);
		double expectedArea = 32.705211996014306;
		double expectedVolume = 327.05211996014305;
		assertEquals(expectedArea, hepta.getBaseArea(), DELTA);
		assertEquals(expectedVolume, hepta.getVolume(), DELTA);
	}
	@Test
	public void testOctagonalPrism() {
		OctagonalPrism octa = new OctagonalPrism(10,3);
		double expectedArea = 43.45584412271571;
		double expectedVolume = 434.5584412271571;
		assertEquals(expectedArea, octa.getBaseArea(), DELTA);
		assertEquals(expectedVolume, octa.getVolume(), DELTA);
	}
	@Test
	public void testEnneagonalPrism() {
		EnneagonalPrism nona = new EnneagonalPrism(10,3);
		double expectedArea = 55.63641774395611;
		double expectedVolume = 556.3641774395611;
		assertEquals(expectedArea, nona.getBaseArea(), DELTA);
		assertEquals(expectedVolume, nona.getVolume(), DELTA);
	}
	@Test
	public void testDecagonalPrism() {
		DecagonalPrism deca = new DecagonalPrism(10,3);
		double expectedArea = 69.2478795864432;
		double expectedVolume = 692.4787958644321;
		assertEquals(expectedArea, deca.getBaseArea(), DELTA);
		assertEquals(expectedVolume, deca.getVolume(), DELTA);
	}

}




