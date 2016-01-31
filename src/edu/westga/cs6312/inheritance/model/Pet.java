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
	 * @param name accepts pet's name
	 * @param sound accepts the sound pet makes
	 * @precondition if (name == "" || name == null) 
	 * @precondition if (sound == "" || sound == null)  
	 */
	public Pet(String name, String sound) {
		if (this.name.equals("") || this.name == null) {
			this.name = "";		
		}
		if (this.sound.equals("") || this.sound == null) {
			this.sound = "";			
		}		
		this.name = name;
		this.sound = sound;
	}
	
	/** 
	 * Method returns string object describing pet
	 * @return string object, description of pet name and sound  
	 */
	public String toString() {
		String stringOutput = "A pet named " + this.name  + "that makes the sound " + this.sound + '"';
		return stringOutput;
	}
	
}
