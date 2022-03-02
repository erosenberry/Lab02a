package edu.ycp.cs320.lab02a_erosenberry.controller;

import edu.ycp.cs320.lab02a_erosenberry.model.GuessingGame;
import edu.ycp.cs320.lab02a_erosenberry.model.Numbers;

public class NumbersController {
	private Numbers model;
	
	public void setModel(Numbers model) {
		this.model = model;
	}
	
	public Double add() {
		return model.getFirst() + model.getSecond() + model.getThird();
	}
	
	public Double multiply() {
		return model.getFirst()*model.getSecond();
	}
}
