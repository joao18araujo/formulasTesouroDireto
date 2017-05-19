import static org.junit.Assert.*;
import org.junit.*;

public class BTNTest {
	BTN btn;
	
	@Before
	public void setUp(){
		btn = new BTN();
	}

	@Test
	public void testUnitaryPriceCalculation(){
		btn.setTR(1.025f);
		btn.setPUant(100);
		assertEquals(102.5, btn.calculateUnitaryPrice(), 1e-6);
	}
	
	@Test
	public void testInterestCalculation(){
		btn.setPUant(100);
		assertEquals(14.017542, btn.calculateInterest(30, 6), 1e-6);
	}
	
	@Test
	public void testMainCalculationWithPUus(){
		btn.setPUus(1.6545);
		assertEquals(24.82, btn.calculateMain(15, "USS"), 1e-2);
	}
}
