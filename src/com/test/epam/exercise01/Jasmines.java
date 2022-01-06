package com.test.epam.exercise01;

public class Jasmines extends Flowers {

	int noOfFlower;

	public Jasmines(int noOfFlower) {
		this.noOfFlower=noOfFlower;
	}
	
	@Override
	public int getCost() {
		return noOfFlower*2;
		
	}


}
