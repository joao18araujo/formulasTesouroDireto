import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

public class NTNA1Test {

	NTNA1 ntna1;
	Date dtp;
	Date dtup;
	float interestTax;
	
	@Before
	public void setUp() throws ParseException{
		ntna1 = new NTNA1();
		ntna1.setBaseDolarQuotation(3.0928F);
		ntna1.setEndDolarQuotation(3.2792F);
		ntna1.setLiquidValue(1.00234F);
		
		dtp = new SimpleDateFormat("dd/MM/yyyy").parse("10/12/2016");
		dtup = new SimpleDateFormat("dd/MM/yyyy").parse("19/04/2017");
		interestTax = 0.045F;
	}
	
	@Test
	public void testPUAmortizationCalculation() throws Exception {
		assertEquals(0.945363F, ntna1.calculatePUAmortization(), (float)1.0E-6F);
	}
	
	@Test
	public void testLiquidValueCalculation() throws Exception {
		float emissionValue = 112.4387F;
		float amortizationPercentual = 0.25F;
		
		ntna1.setLiquidValue(emissionValue, amortizationPercentual);
		
		assertEquals(28.109675F, ntna1.getLiquidValue(), (float)1.0E-6F);
	}
	
	@Test
	public void testInterestCalculation() throws Exception {
		float[] interestFactors = new float[1];
		interestFactors[0] = ntna1.calculateInterestFactor(dtp, dtup, interestTax);
		
		float interest = ntna1.calculateInterest(ntna1.calculatePUAmortization(), ntna1.calculateInterestFactorSum(interestFactors));

		assertEquals(0.00015321F, interest, (float)1.0E-6F);
	}
	
	@Test 
	public void testInterestFactorCalculation() throws Exception {
		assertEquals(0.0001625F, ntna1.calculateInterestFactor(dtp, dtup, interestTax), (float)1.0E-8F);		
	}
	
	@Test 
	public void testInterestFactorSumCalculation() throws Exception {
		float[] interestFactors = new float[2];
		
		interestFactors[0] = ntna1.calculateInterestFactor(new SimpleDateFormat("dd/MM/yyyy").parse("10/12/2016"), new SimpleDateFormat("dd/MM/yyyy").parse("19/04/2017"), 0.045F);
		interestFactors[1] = ntna1.calculateInterestFactor(new SimpleDateFormat("dd/MM/yyyy").parse("06/10/2016"), new SimpleDateFormat("dd/MM/yyyy").parse("29/03/2017"), 0.165F);
		
		assertEquals(0.00096F, ntna1.calculateInterestFactorSum(interestFactors), (float)1.0E-8F);		
	}
	
}
