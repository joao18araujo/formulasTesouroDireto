import static org.junit.Assert.assertEquals;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class LFTTest {
	
	private LFT lft;
	private SelicTax selicTax;
	
	@Before
	public void setUp() throws Exception{
		lft = new LFT(3.0F);
		lft.setBaseDate(new SimpleDateFormat("dd/MM/yyyy").parse("15/05/2017"));
		lft.setEndDate(new SimpleDateFormat("dd/MM/yyyy").parse("18/05/2017"));
		selicTax = new SelicTax();
		selicTax.calculateSelicTax(1.0F);
	}
    
	@Test
	public void testSelicTaxCalculation() throws Exception {
		assertEquals(0.000039486F, selicTax.getSelicTax(), (float)1.0E-8F);
	}
	
	@Test
	public void testActualNominalValueCalculation() throws Exception {
		assertEquals(0.00011844F, lft.calculateActualNominal(selicTax), (float)1.0E-6F);
	}
	
	@Test
	public void testPeriodConverionInDays() throws Exception {		
		assertEquals(3, selicTax.calculatePeriodDays(lft.getBaseDate(), lft.getEndDate()));
	}
		
	@Test 
	public void testResultFactor() throws Exception {
		List <SelicTax> selicTaxs = new ArrayList<SelicTax>();
		selicTaxs.add(new SelicTax(1.0F));
		selicTaxs.add(new SelicTax(1.1F));
		selicTaxs.add(new SelicTax(1.2F));
		
		assertEquals(1.0001302F, selicTax.calculateResultFactor(lft.getBaseDate(), lft.getEndDate(), selicTaxs), (float)1.0E-8F);
	}
	
	
}
