package com.test.epam.exercise01;

public class Roses extends Flowers {
	
	int noOfFlower;

	public Roses(int noOfFlower) {
		this.noOfFlower=noOfFlower;
	}

	@Override
	public int getCost() {
		return noOfFlower*1;
		
	}

}
