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
		btn.setTR(1.025);
		btn.setPUant(100);
		assertEquals(btn.calculateUnitaryPrice(), 102.5, 0);
	}
}
