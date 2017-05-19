import static org.junit.Assert.*;
import org.junit.*;

public class LTNTest {
	LTN ltn;
	
	@Before
	public void setUp(){
		ltn = new LTN();
	}
	
	@Test
	public void testCalculateUnitaryPrice(){
		ltn.setTind(0.1f);
		assertEquals(99.962185f, ltn.calculateUnitaryPrice(), 1e-6f);
	}
}
