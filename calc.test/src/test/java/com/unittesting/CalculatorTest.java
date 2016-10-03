package com.unittesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testMultiply() {
		assertEquals(4L, new Calculator().summ(2L, 2L));
	}

}
