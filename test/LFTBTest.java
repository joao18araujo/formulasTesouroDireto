import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class LFTBTest {

	private LFTB lftb;
	
	@Before
	public void setUp() throws Exception{
		lftb = new LFTB();
		
		lftb.setNominalValue(102.216F);
		lftb.setWorkingDays(194);
		lftb.setNextWorkingDays(358);
		lftb.setQuantityPortion(60);
		lftb.setQuantityAmortizedPortion(45);
	}	
	
	@Test
	public void testActualNominalValueCalculation() throws Exception {	
		assertEquals(126.00644F, lftb.calculateActualNominalValue(1.3208F), (float)1.0E-6F);
	}

}
