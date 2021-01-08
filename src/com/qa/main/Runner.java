package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		
		Coins changeSum = new Coins();
		
		float cost = 4.58f;
		float sumGiven = 20.00f;
		float sumBack = 0f;
		
		sumBack = changeSum.subtract(cost, sumGiven);
		changeSum.separatingSum(sumBack);
		
	}

}
