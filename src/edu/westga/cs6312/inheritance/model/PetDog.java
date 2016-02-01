package edu.westga.cs6312.inheritance.model;

/**
 * Homework 04
 * @author 	cs6312
 * @author 	jim perry, jr.
 * @version	01.30.2016
 */
public class PetDog extends Pet{
	private int soundLevel;
	
	/** 
	 * Pet constructor 
	 */
	public PetDog(String petName, String petSound, int level) {
		super(petName, petSound);
		
		if (this.soundLevel == 0) {
			this.soundLevel = 5;	
		}
		this.soundLevel = level;
	}
}
