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
}