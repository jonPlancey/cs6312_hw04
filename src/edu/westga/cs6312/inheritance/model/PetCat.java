package edu.westga.cs6312.inheritance.model;


/**
 * Homework 04
 * @author 	cs6312
 * @author 	jim perry, jr.
 * @version	01.30.2016
 */
public class PetCat extends Pet {

	
	private int cuteness;
	

	/** 
	 * Pet constructor 
	 * @param petName accepts pet's name
	 * @param petSound accepts the sound pet makes
	 * @precondition if (this.sound == null)
	 * @precondition if (this.name == null) 
	 */
	public PetCat(String petName, String petSound) {
		super(petName, petSound);
		this.cuteness = 0;			
	}
	
	/** 
	 * Pet constructor 
	 * @param petName accepts pet's name
	 * @param petSound accepts the sound pet makes
	 * @param level accepts the cat's cutness level 
	 * @precondition if (level > 0 && level < 10 )    
	 */
	public PetCat(String petName, String petSound, int level) {
		super(petName, petSound);
		if (level > 0 && level < 10 ) {
			this.cuteness = level;
		}
	}

	
	/** 
	 * Method returns pet's sound level
	 * @return pet's sound level  
	 */
	public int getCutenessLevel() {					
		return this.cuteness;
	}	
		
	
	/** 
	 * Method returns pet's name
	 * @return pet's name  
	 */
	public String getPetCatName() {					
		return super.getPetName();
	}	
	
	/** 
	 * Method returns pet's sound
	 * @return pet's sound  
	 */
	public String getPetCatSound() {	
		return super.getPetSound();
	}
	
	/** 
	 * Method returns string object describing pet
	 * @return string object, description of pet name and sound  
	 */
	public String toString() {		
		return super.toString() + " at level " + this.cuteness;
	}		
	
	
}
