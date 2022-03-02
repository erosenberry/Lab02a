package edu.ycp.cs320.lab02.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.lab02a_erosenberry.model.Numbers;
public class NumbersTest {
	private Numbers model;
	
	@Before
	public void setUp() {
		model = new Numbers();
	}
	
	@Test
	public void testSetNumbers() {
		model.setFirst(10.45);
		assertTrue(model.getFirst() == 10.45);
		model.setSecond(14);
		assertTrue(model.getSecond() == 14);
		model.setThird(12.55);
		assertTrue(model.getThird() == 12.55);
	}
	
	@Test
	public void testSetResult() {
		model.setResult(1000.55555);;
		assertTrue(1000.55555 == model.getResult());
	}
}
