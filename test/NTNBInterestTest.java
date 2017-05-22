import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class NTNBInterestTest {
	
	NTNBInterest ntnbInterest;
	
	@Before
	public void setUp() {
		ntnbInterest = new NTNBInterest();
	}
	
	@Test
	public void testInterestFactorCalculation() throws Exception {
		ntnbInterest.setI(0.49);
		ntnbInterest.setN(6);
		ntnbInterest.setDcp(423);
		ntnbInterest.setDct(397);
		
		assertEquals(1.00260747, ntnbInterest.calculateIntestFactor(), 1e-8);
	}

}
