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
		if (level >= 0) {
			this.soundLevel = level;
		}
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
		System.out.println("petDog class: " + super.getPetSound());
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
