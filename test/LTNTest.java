import static org.junit.Assert.*;
import org.junit.*;

public class LTNTest {
	private LTN ltn;
	
	@Before
	public void setUp(){
		ltn = new LTN();
	}
	
	@Test
	public void testCalculateUnitaryPrice(){
		ltn.setTind(0.1f);
		assertEquals(999.621856, ltn.calculateUnitaryPrice(), 1e-6);
	}
}
