package edu.westga.cs6312.inheritance.model;


/**
 * Homework 04
 * @author 	cs6312
 * @author 	jim perry, jr.
 * @version	01.30.2016
 */
public class Pet {
	private String name;
	private String sound;
	
	/** 
	 * Pet constructor 
	 * @param petName accepts pet's name
	 * @param petSound accepts the sound pet makes
	 * @precondition if (this.sound == null)
	 * @precondition if (this.name == null) {  
	 */
	public Pet(String petName, String petSound) {
		if (this.name == null) {
			this.name = "";	
		}
		if (this.sound == null) {
			this.sound = "";			
		}	
		this.name = petName;
		this.sound = petSound;	
	}
	
	/** 
	 * Method returns string object describing pet
	 * @return string object, description of pet name and sound  
	 */
	public String toString() {		
		String stringOutput = "A pet named " + this.name  + " that makes the sound " + this.sound;		
		return stringOutput;
	}
	
	/** 
	 * Method returns pet's name
	 * @return pet's name  
	 */
	public String getPetName() {					
		return this.name;
	}	
	
	/** 
	 * Method returns pet's sound
	 * @return pet's sound  
	 */
	public String getPetSound() {	
		return this.sound;
	}	
	

}
