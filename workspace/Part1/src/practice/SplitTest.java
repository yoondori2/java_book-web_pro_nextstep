package practice;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SplitTest {

	
	@Test
	public void Split() {
		assertArrayEquals(new String[] {"1"}, "1".split(","));
	}
}
