package com.test.epam.exercise01;

public class Bouquet {

	
	public static void main(String[] args) {
		
		Bouquet bouquet=new Bouquet();
		bouquet.getCostOfBouquet(new Roses(1),new Jasmines(8),new Lilys(2));
		
	}
	
	public void getCostOfBouquet(Roses roses, Jasmines jasmines, Lilys lilys) {
		int costOfFlower=roses.getCost()+jasmines.getCost()+lilys.getCost();
		System.out.println("Cost of Bouquet is = "+costOfFlower+"$");
		
	}

}
