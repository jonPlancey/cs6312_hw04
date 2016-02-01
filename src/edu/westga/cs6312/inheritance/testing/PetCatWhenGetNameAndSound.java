package edu.westga.cs6312.inheritance.testing;

import static org.junit.Assert.*;
import org.junit.Test;

import edu.westga.cs6312.inheritance.model.PetCat;


/**
 * Homework 04 Unit Tests
 * @author 	cs6312
 * @author 	jim perry, jr.
 * @version	01.30.2016
 */
public class PetCatWhenGetNameAndSound {



	
	/**
	 * Test, make sure getPetCatSound returns
	 * the correct sound of the created pet
	 */		
	@Test
	public void testPetCatWhenGetSoundArf() {
		PetCat animal = new PetCat("Queen", "meeoow", 5);		
		String result = animal.getPetCatSound();		
		assertEquals("meeoow", result);	
	}
	

	/**
	 * Test, make sure getPetCatSound returns
	 * the correct sound of the created pet
	 */		
	@Test
	public void testPetCatWhenGetSoundOwloo() {
		PetCat animal = new PetCat("Princess", "meow", 1);			
		String result = animal.getPetCatSound();		
		assertEquals("meow", result);	
	}
	

	
	
	/**
	 * Test, make sure getCutenessLevel returns
	 * the correct sound of the created pet
	 */		
	@Test
	public void testPetCatWhenGetLevel07() {
		PetCat animal = new PetCat("Queen", "meeoow", 5);		
		int result = animal.getCutenessLevel();		
		assertEquals(5, result);	
	}
	

	/**
	 * Test, make sure getCutenessLevel returns
	 * the correct sound of the created pet
	 */		
	@Test
	public void testPetCatWhenGetLevel01() {
		PetCat animal = new PetCat("Princess", "meow", 1);			
		int result = animal.getCutenessLevel();		
		assertEquals(1, result);	
	}	

}
