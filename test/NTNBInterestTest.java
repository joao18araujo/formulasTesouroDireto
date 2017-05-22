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

	@Test
	public void testInterestFactorCalculation2() throws Exception {
		ntnbInterest.setI(1.23);
		ntnbInterest.setN(3);
		ntnbInterest.setDcp(120);
		ntnbInterest.setDct(115);
		
		assertEquals(1.00319421, ntnbInterest.calculateIntestFactor(), 1e-8);
	}	
}
