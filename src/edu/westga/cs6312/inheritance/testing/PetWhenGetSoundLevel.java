package edu.westga.cs6312.inheritance.testing;

import static org.junit.Assert.*;
import org.junit.Test;

import edu.westga.cs6312.inheritance.model.PetCat;

/**
 * Homework 04 unit tests
 * @author 	cs6312
 * @author 	jim perry, jr.
 * @version	01.30.2016
 */
public class PetWhenGetSoundLevel {


	/**
	 * Test, make sure getPetCatSound returns
	 * the correct sound of the created pet
	 */	
	@Test
	public void testPetCatWhenGetSoundBoo() {
		PetCat pet = new PetCat("Harris", "boo");		
		String expect = "boo";
		String result = pet.getPetCatSound();		
		assertEquals(expect, result);	
	}
	

	/**
	 * Test, make sure getPetCatSound returns
	 * the correct sound of the created pet
	 */		
	@Test
	public void testPetCatWhenGetSoundRoar() {
		PetCat pet = new PetCat("Nala", "roar");		
		String expect = "roar";
		String result = pet.getPetCatSound();		
		assertEquals(expect, result);		
	}
	

	/**
	 * Test, make sure getPetCatSound returns
	 * the correct sound of the created pet
	 */		
	@Test
	public void testPetCatWhenGetNameArf() {
		PetCat pet = new PetCat("Violet", "arf");		
		String expect = "Violet";
		String result = pet.getPetCatName();		
		assertEquals(expect, result);	
	}
	

	/**
	 * Test, make sure getPetCatSound returns
	 * the correct sound of the created pet
	 */		
	@Test
	public void testPetCatWhenGetNameBolt() {
		PetCat pet = new PetCat("Bolt", "owloo");		
		String expect = "Bolt";
		String result = pet.getPetCatName();		
		assertEquals(expect, result);	
	}	

}
