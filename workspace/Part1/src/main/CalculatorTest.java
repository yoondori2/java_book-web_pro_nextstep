package main;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class CalculatorTest {
	
	@Test
	public void add() {
		Calculator cal = new Calculator();
		assertEquals(9,cal.add(6, 3));
	}
	
	@Test
	public void substract() {
		Calculator cal = new Calculator();
		System.out.println(cal.substract(6, 3));
	}
}
