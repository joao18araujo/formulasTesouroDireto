import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NTNA3Test {
	
	NTNA3 ntna3;
	
	@Before
	public void setUp(){
		ntna3 = new NTNA3();
		ntna3.setBaseDolarQuotation(3.0928F);
		ntna3.setEndDolarQuotation(3.2792F);
	}
	
	@Test
	public void testNominalValueCalculation() throws Exception {
		assertEquals(943.15686F, ntna3.calculateNominalValue(), (float)1.0E-6F);		
	}
	
	@Test
	public void testInterestFactorCalculation() throws Exception {
		assertEquals(0.0025F, ntna3.calculateInterestFactor(1, 3), (float)1.0E-6F);
	}
	
	@Test
	public void testInterestCalculation() throws Exception {
		float nominalValue = ntna3.calculateNominalValue();
		float interestFactor = ntna3.calculateInterestFactor(1, 2);
		
		assertEquals(1.5719281F, ntna3.calculateInterest(nominalValue, interestFactor), (float)1.0E-6F);
	}
}
