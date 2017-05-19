import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.*;

public class NTNA6Test {
	private NTNA6 ntna6;
	
	@Before
	public void setUp(){
		ntna6 = new NTNA6();
	}
	
	@Test
	public void testUpdatedNominalValueCalculation(){
		double ussa = 3.14;
		double ussb = 3.28;
		ntna6.setVE(1500.50);
		
		assertEquals(1436.454268, ntna6.calculateUpdatedNominalValue(ussa, ussb), 1e-6);
	}
	
	@Test
	public void testInterestCalculation() throws ParseException{
		Date dtp = new SimpleDateFormat("dd/MM/yyyy").parse("10/05/2017");
		Date dtup = new SimpleDateFormat("dd/MM/yyyy").parse("30/06/2017");
		double interest = 4;
		
		ntna6.setVNA(2350.56);
		
		assertEquals(13.058666, ntna6.calculateInterest(dtp, dtup, interest), 1e-6);
		
	}
}
