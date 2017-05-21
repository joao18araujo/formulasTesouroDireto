import static org.junit.Assert.*;
import org.junit.*;

public class NTNBTest {
	
	NTNB ntnb;
	
	@Before
	public void setUp(){
		ntnb = new NTNB();
	}
	
	@Test
	public void testNominalValueFactorCalculation(){
		ntnb.setIPCAt1(1.43);
		ntnb.setIPCAt0(1.01);
		ntnb.setDc(20);
		ntnb.setDct(34);
		
		assertEquals(1.226964, ntnb.calculateNominalValueFactor(), 1e-6);
	}

	@Test
	public void testNominalValueFactorCalculation2(){
		ntnb.setIPCAt1(2.04);
		ntnb.setIPCAt0(1.35);
		ntnb.setDc(35);
		ntnb.setDct(60);
		
		assertEquals(1.272300, ntnb.calculateNominalValueFactor(), 1e-6);
	}

	
}
