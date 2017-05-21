import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class NTNBTest {
	
	NTNB ntnb;
	double expected;
	
	public NTNBTest(double IPCAt1, double IPCAt0, int dc, int dct, double expected){
		ntnb = new NTNB();
		ntnb.setIPCAt1(IPCAt1);
		ntnb.setIPCAt0(IPCAt0);
		ntnb.setDc(dc);
		ntnb.setDct(dct);
		
		this.expected = expected;
	}
	
	@Parameters
	public static Iterable data(){
		return Arrays.asList(new Object[][]{
			{1.43, 1.01, 20, 34, 1.226964},
			{2.04, 1.35, 35, 60, 1.272300},
			{1.56, 1.00, 13, 20, 1.335152}
		});
	}
	
	@Test
	public void testNominalValueFactorCalculation(){
		assertEquals(expected, ntnb.calculateNominalValueFactor(), 1e-6);
	}	
}
