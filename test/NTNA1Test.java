import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NTNA1Test {

	NTNA1 ntna1;
	
	@Before
	public void setUp(){
		ntna1 = new NTNA1();
	}
	
	@Test
	public void testPUAmortizationCalculation() throws Exception {
		ntna1.setBaseDolarQuotation(3.0928F);
		ntna1.setEndDolarQuotation(3.2792F);
		ntna1.setLiquidValue(1.00234F);
		
		assertEquals(0.945363F, ntna1.calculatePUAmortization(), (float)1.0E-6F);
	}

}
