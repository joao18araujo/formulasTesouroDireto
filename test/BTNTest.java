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
		assertEquals(btn.calculateUnitaryPrice(), 102.5, 1e-6);
	}
	
	@Test
	public void testInterestCalculation(){
		btn.setPUant(100);
		assertEquals(btn.calculateInterest(30, 6), 14.017542, 1e-6);
	}
}
