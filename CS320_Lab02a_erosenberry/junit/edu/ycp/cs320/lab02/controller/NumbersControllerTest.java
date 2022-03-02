package edu.ycp.cs320.lab02.controller;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.lab02a_erosenberry.controller.NumbersController;
import edu.ycp.cs320.lab02a_erosenberry.model.Numbers;

public class NumbersControllerTest {
	private Numbers model;
	private NumbersController controller;
	
	@Before
	public void setUp() {
		model = new Numbers();
		
		controller = new NumbersController();
		controller.setModel(model);
		model.setFirst(10);
		model.setSecond(14);
		model.setThird(3);
	}
	
	@Test
	public void testMultiply() {
		
		assertTrue(controller.multiply() == 140);
	}
	@Test
	public void testAdd() {
		
		assertTrue(controller.add() == 27);
	}
}
