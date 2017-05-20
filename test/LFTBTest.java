import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class LFTBTest {

	private LFTB lftb;
	
	@Before
	public void setUp() throws Exception{
		lftb = new LFTB();
	}	
	
	@Test
	public void testActualNominalValueCalculation() throws Exception {
		lftb.setVe(102.216F);
		lftb.setDu(194);
		lftb.setDut(358);
		lftb.setP(60);
		lftb.setN(45);
		
		assertEquals(135.0069F, lftb.calculateActualNominal(1.3208F), (float)1.0E-6F);
	}
}
