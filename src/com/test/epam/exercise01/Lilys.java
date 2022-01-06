package com.test.epam.exercise01;

public class Lilys extends Flowers{
	
	int noOfFlower;

	public Lilys(int noOfFlower) {
		this.noOfFlower=noOfFlower;
	}
	

	@Override
	public int getCost() {
		return noOfFlower*3;
		
	}

}
