package main;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest2 {
	//Calculator: Calculator 인스턴스를 생성하는 부분에 중복이 발생한다.
	//이 클래스에서는 그 중복되는 것을 제거해줄 것이다. 
	
	private Calculator cal;
	
	@Before
	public void setup() {
		cal = new Calculator();
		System.out.println("before");
	}
	
	@Test
	public void add() {
		assertEquals(9,cal.add(6, 3));
		System.out.println("add");
	}
	
	@Test
	public void substract() {
		assertEquals(3,cal.substract(6, 3));
		System.out.println("substract");
	}
	@After
	public void teardown() {
		System.out.println("teardown");
	}
}
