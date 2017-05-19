import org.junit.*;

public class LTNTest {
	@Before
	public void setUp(){
		LTN ltn = new LTN();
	}
	
	@Test
	public void testCalculateUnitaryPrice(){
		ltn.setTind(1.22);
		assertEquals(99.962185, ltn.calculateUnitaryPrice(), 1e-6f);
	}
}
