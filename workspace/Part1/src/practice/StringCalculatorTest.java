package practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest {
	private StringCalculator cal;
	
	@Before
	public void setup() {
		cal = new StringCalculator();
	}
	@Test
	public void add_null_bin() {
		assertEquals(0, cal.add(null));
		assertEquals(0, cal.add(""));
	}
	@Test
	public void add_char() {
		assertEquals(4, cal.add("4"));
	}
	@Test
	public void add_rest() {
		assertEquals(7, cal.add("4,3"));
		assertEquals(9, cal.add("4,2:3"));
	}
	@Test
	public void add_custom() {
		assertEquals(6, cal.add("//;\n1;2;3"));
	}
	@Test(expected = RuntimeException.class)
	public void add_error() {
		cal.add("-2,3,2");
	}
}
