import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LFTTest {
	
	private LFT lft;
	private SelicTax selicTax;
	
	@Before
	public void setUp(){
		lft = new LFT(3.0F);
		selicTax = new SelicTax();
		selicTax.calculateSelicTax(1.0F);
	}
    
	@Test
	public void testSelicTaxCalculation() throws Exception {
		assertEquals(0.000039486F, selicTax.getSelicTax(), (float)1.0E-8F);
	}
	
	
	@Test
	public void testActualNominalValueCalculation() throws Exception {
		assertEquals(0.00011844F, lft.calculateActualNominal(selicTax), (float)1.0E-6F);
	}
	
	
}
