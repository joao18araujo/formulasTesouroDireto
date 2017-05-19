import static org.junit.Assert.*;
import org.junit.*;

public class NTNA6Test {
	private NTNA6 ntna6;
	
	@Before
	public void setUp(){
		ntna6 = new NTNA6();
	}
	
	@Test
	public void testUpdatedNominalValueCalculation(){
		double ussa = 3.14f;
		double ussb = 3.25f;
		ntna6.setVE(1500.50);
		
		assertEquals(1436.454268, ntna6.calculateUpdatedNominalValue(ussa, ussb), 1e-6);
	}
	
}
