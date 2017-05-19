import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LFTTest {
	
	private LFT lft;
	
	@Before
	public void setUp(){
		lft = new LFT(1.000F, 3.0F);
	}
    
	@Test
	public void testSelicTaxCalculation() throws Exception {
		assertEquals(lft.calculateSelicTax(), 0.000039486F, (float)1.0E-8F);
	}
	
	
	@Test
	public void testActualNominalValueCalculation() throws Exception {
		assertEquals(lft.calculateActualNominal(), 0.00011844F, (float)1.0E-6F);
	}
	
	
}
