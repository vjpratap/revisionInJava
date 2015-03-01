import org.junit.Test;
import static org.junit.Assert.*;
public class RevisionTest{
	@Test
	public void giveReverseText(){
		Revision r = new Revision();
		assertEquals("olleh",r.reverse("hello"));
		assertEquals(".olleh .olleh", r.reverse("hello. hello."));
	}
	@Test
	public void getFibonacci(){
		Revision r = new Revision();
		assertEquals(1 , r.fibonacci(3));
		assertEquals(0 , r.fibonacci(1));
		assertEquals(3 , r.fibonacci(5));
	}
	@Test 
	public void test_that_function_read_binary_converts_binary_number_in_decimal(){
		Revision r = new Revision();
		assertEquals(0,r.readBinary(0));
		assertEquals(1,r.readBinary(1));
		assertEquals(2,r.readBinary(10));
		assertEquals(9,r.readBinary(1001));
		assertEquals(255,r.readBinary(11111111));
	}
}