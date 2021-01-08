package com.qa.main;

public class Coins {
	
	public float subtract(float cost, float sumGiven) {
		
		float sumBack = 0f;
		
		sumBack = sumGiven - cost;
		System.out.println(sumBack);
		
		return sumBack;
		
	}
	
	public void separatingSum(float sumBack) {
		
		float[] possibleNotes = {50.00f, 20.00f, 10.00f, 5.00f, 2.00f, 1.00f, 0.50f, 0.20f, 0.05f, 0.02f, 0.01f};
		
		
		float possibleNote = 0f;
		for (int i = 0; i < possibleNotes.length; i++) {
		float currentNote = possibleNotes[i];
		float separatedSum = 0f;
		
		possibleNote = sumBack / currentNote;
		
		if(possibleNote > 1) {
			
			separatedSum = currentNote; 
			System.out.println(separatedSum + "£");
			sumBack = sumBack - currentNote;
			
			possibleNote = sumBack / currentNote;
			
			if(possibleNote > 1) {
				
				separatedSum = currentNote; 
				System.out.println(separatedSum + "£");
				sumBack = sumBack - currentNote;
			}
			
		}
			
			
		}
		
		
	}
	
	
	
	
	

}
