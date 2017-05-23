import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class NTNBInterestTest {
	
	NTNBInterest ntnbInterest;
	double expected;
	
	public NTNBInterestTest(double i, int n, int dcp, int dct, double expected) {
		ntnbInterest = new NTNBInterest();
		
		ntnbInterest.setI(i);
		ntnbInterest.setN(n);
		ntnbInterest.setDcp(dcp);
		ntnbInterest.setDct(dct);
		
		this.expected = expected;
	}
	
	@Parameters
	public static Iterable data(){
		return Arrays.asList(new Object[][]{
			{0.49, 6, 423, 397, 1.00260747},
			{1.23, 3, 120, 115, 1.00319421},
			{2.4353, 2, 60, 48, 1.00502533}
		});
	}
	
	@Test
	public void testInterestFactorCalculation() throws Exception {
		assertEquals(expected, ntnbInterest.calculateIntestFactor(), 1e-8);
	}

}
