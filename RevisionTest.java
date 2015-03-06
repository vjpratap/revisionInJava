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
	public void readBinary_reads_numbers_as_binary(){
		Revision r = new Revision();
		assertEquals(0,r.readBinary(0));
		assertEquals(1,r.readBinary(1));
		assertEquals(2,r.readBinary(10));
		assertEquals(9,r.readBinary(1001));
		assertEquals(255,r.readBinary(11111111));
	}
	@Test 
	public void readBinary_reads_text_as_binary(){
		Revision r = new Revision();
		assertEquals(0,r.readBinary("0"));
		assertEquals(1,r.readBinary("1"));
		assertEquals(2,r.readBinary("10"));
		assertEquals(9,r.readBinary("1001"));
		assertEquals(255,r.readBinary("11111111"));	
	}
	@Test
	public void readOctal_reads_numbers_as_octal(){
		Revision r = new Revision();
		assertEquals(0,r.readOctal(0));
		assertEquals(1,r.readOctal(1));
		assertEquals(8,r.readOctal(10));
		assertEquals(513,r.readOctal(1001));
		assertEquals(299593,r.readOctal(1111111));
	};

}