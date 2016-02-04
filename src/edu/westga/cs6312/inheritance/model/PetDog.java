package edu.westga.cs6312.inheritance.model;

/**
 * Homework 04
 * @author 	cs6312
 * @author 	jim perry, jr.
 * @version	01.30.2016
 */
public class PetDog extends Pet {
	private int soundLevel;
	

	/** 
	 * Pet constructor 
	 * @param petName accepts pet's name
	 * @param petSound accepts the sound pet makes
	 * @precondition if (this.sound == null)
	 * @precondition if (this.name == null) 
	 */
	public PetDog(String petName, String petSound) {
		super(petName, petSound);
		this.soundLevel = 0;			
	}
	
	/** 
	 * Pet constructor 
	 * @param petName accepts pet's name
	 * @param petSound accepts the sound pet makes
	 * @param level accepts the pet's volume level 
	 * @precondition if (this.sound == null)
	 * @precondition if (this.name == null) 
	 * @precondition if (this.soundLevel == 0)    
	 */
	public PetDog(String petName, String petSound, int level) {
		super(petName, petSound);
		this.setPetDogLevel(level);
	}

	
	/** 
	 * Method sets animal sound level
	 * @param level  of sound to be set  
	 */	
	public void setPetDogLevel(int level) {					
		if ((int) Math.round(level) > 0 && (int) Math.round(level) < 10) {
			this.soundLevel = level;
		}
	}
	
	/** 
	 * Method returns pet's sound level
	 * @return pet's sound level  
	 */
	public int getPetDogLevel() {					
		return this.soundLevel;
	}	
		
	
	/** 
	 * Method returns pet's name
	 * @return pet's name  
	 */
	public String getPetDogName() {					
		return super.getPetName();
	}	
	
	/** 
	 * Method returns pet's sound
	 * @return pet's sound  
	 */
	public String getPetDogSound() {	
		return super.getPetSound();
	}
	
	/** 
	 * Method returns string object describing pet
	 * @return string object, description of pet name and sound  
	 */
	public String toString() {		
		return super.toString() + " at level " + this.soundLevel;
	}	
}
