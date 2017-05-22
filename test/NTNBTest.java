import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class NTNBTest {
	
	NTNB ntnb;
	double nominalValueExpected, nominalValueFactorExpected;
	
	public NTNBTest(double IPCAt1, double IPCAt0, int dc, int dct, double nominalValueFactorExpected, 
					double IPCAt, double VN, double nominalValueExpected){
		ntnb = new NTNB();
		ntnb.setIPCAt1(IPCAt1);
		ntnb.setIPCAt0(IPCAt0);
		ntnb.setDc(dc);
		ntnb.setDct(dct);
		ntnb.setIPCAt(IPCAt);
		ntnb.setVN(VN);
		
		this.nominalValueFactorExpected = nominalValueFactorExpected;
		this.nominalValueExpected = nominalValueExpected;
	}
	
	@Parameters
	public static Iterable data(){
		return Arrays.asList(new Object[][]{
			{1.43, 1.01, 20, 34, 1.226964, 1.63, 2508.90, 4967.997887},
			{2.04, 1.35, 35, 60, 1.272300, 2.82, 3104.58, 8251.021568},
			{1.56, 1.00, 13, 20, 1.335152, 0, 0, 0}
		});
	}
	
	@Test
	public void testNominalValueFactorCalculation(){
		assertEquals(nominalValueFactorExpected, ntnb.calculateNominalValueFactor(), 1e-6);
	}
	
	@Test
	public void testNominalValueCalculation(){
		assertEquals(nominalValueExpected, ntnb.calculateNominalValue(), 1e-6);
	}

}
