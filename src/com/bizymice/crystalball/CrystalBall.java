package com.bizymice.crystalball;

import java.util.Random;

public class CrystalBall {
	// Member variables (properties about the object)
	public String[] mAnswers = {
    		"It is certain",
    		"It is decidedly so",
    		"All signs say YES",
    		"The stars are not aligned",
    		"My reply is NO",
    		"It is doubtful", 
    		"You probably don't wan't to know",
    		"Ask again later",
    		"MAYBE" };
	
	// Methods (abilities: things it can do)
	public String getAnAnswer() {
            String answer = "";
            
            // Randomly select one of three answers: Yes, No, or Maybe
            Random randomGenerator = new Random(); // Construct a new Random number generator
            int randomNumber = randomGenerator.nextInt(mAnswers.length);
            
            answer = mAnswers[randomNumber];
            
            return answer;
	}

}
