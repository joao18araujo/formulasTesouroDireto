import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class NTNBInterestTest {
	
	NTNBInterest ntnbInterest;
	double interestFactorExpected;
	double interestExpected;
	
	public NTNBInterestTest(double i, int n, int dcp, int dct, double interestFactorExpected, double interestFactor, double vna, double interestExpected) {
		ntnbInterest = new NTNBInterest();
		
		ntnbInterest.setI(i);
		ntnbInterest.setN(n);
		ntnbInterest.setDcp(dcp);
		ntnbInterest.setDct(dct);
		ntnbInterest.setVna(vna);
		ntnbInterest.setInterestFactor(interestFactor);
		
		this.interestExpected = interestExpected;
		this.interestFactorExpected = interestFactorExpected;
	}
	
	@Parameters
	public static Iterable data(){
		return Arrays.asList(new Object[][]{
			{0.49, 6, 423, 397, 1.00260747, 1.84569612, 2137.34, 1807.540145},
			{1.23, 3, 120, 115, 1.00319421, 0, 0, 0},
			{2.4353, 2, 60, 48, 1.00502533, 0, 0, 0}
		});
	}
	
	@Test
	public void testInterestFactorCalculation() throws Exception {
		assertEquals(interestFactorExpected, ntnbInterest.calculateInterestFactor(), 1e-8);
	}
	
	@Test
	public void testInterestCalculation() throws Exception {
		assertEquals(interestExpected, ntnbInterest.calculateInterest(), 1e-6);
	}

}
