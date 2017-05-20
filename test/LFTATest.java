import static org.junit.Assert.assertEquals;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class LFTATest {

	private LFTA lfta;

	@Before
	public void setUp() throws Exception {
		lfta = new LFTA();

		lfta.setNominalValue(102.216F);
		lfta.setWorkingDays(194);
		lfta.setNextWorkingDays(358);
		lfta.setQuantityPortion(60);
		lfta.setQuantityAmortizedPortion(45);
	}

	@Test
	public void testActualNominalValueCalculation() throws Exception {
		assertEquals(126.00644F, lfta.calculateActualNominalValue(1.3208F), (float) 1.0E-6F);
	}

	@Test
	public void testActualNominalValueCalculationWithProductFactor() throws Exception {
		List<SelicTax> selicTaxs = new ArrayList<SelicTax>();
		selicTaxs.add(new SelicTax(1.0F));
		selicTaxs.add(new SelicTax(1.1F));
		selicTaxs.add(new SelicTax(1.2F));

		Date baseDate = new SimpleDateFormat("dd/MM/yyyy").parse("15/05/2017");
		Date endDate = new SimpleDateFormat("dd/MM/yyyy").parse("18/05/2017");

		SelicTax selicTax = new SelicTax();
		float productFactor = selicTax.calculateResultFactor(baseDate, endDate, selicTaxs);

		assertEquals(95.414024F, lfta.calculateActualNominalValue(productFactor), (float) 1.0E-6F);
	}

}
