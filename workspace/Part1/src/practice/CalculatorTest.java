package practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	private Calculator cal;
	
	@Before
	public void setup() {
		cal = new Calculator();
	}
	@Test
	public void add_empty() {
		assertEquals(0,cal.add(null));
		assertEquals(0,cal.add(""));
	}
	@Test
	public void add_string() {
		assertEquals(3, cal.add("3"));
	}
	@Test
	public void add_seperate() {
		assertEquals(5,cal.add("3,2"));
		assertEquals(9,cal.add("3,2:4"));
	}
	@Test
	public void add_regx() {
		assertEquals(8, cal.add("//;\n3;4;1"));
	}
	@Test(expected = RuntimeException.class)
	public void add_minus() {
		 cal.add("-2,3,4");
	}
}
