package edu.westga.cs6312.inheritance.testing;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.westga.cs6312.inheritance.model.PetCat;

public class PetCatWhenCreatePetCat {

	

	/**
	 * Test, verify PetCat object is correctly created
	 */		
	@Test
	public void testPetCatWhenCreatePetVioletArf() {
		PetCat animal = new PetCat("Violet", "arf");		
		String expect = "A pet named Violet that makes the sound arf at level 0";
		String result = animal.toString();		
		assertEquals(expect, result);	
	}
	

	/**
	 * Test, verify PetCat object is correctly created
	 */		
	@Test
	public void testPetCatWhenCreatePetBoltOwloo() {
		PetCat animal = new PetCat("Bolt", "owloo");		
		String expect = "A pet named Bolt that makes the sound owloo at level 0";
		String result = animal.toString();		
		assertEquals(expect, result);	
	}		

	/**
	 * Test, verify PetCat object is correctly created
	 */		
	@Test
	public void testPetCatWhenCreatePetVioletArf09() {
		PetCat animal = new PetCat("Queen", "meeoow", 5);		
		int result = animal.getCutenessLevel();		
		assertEquals(5, result);	
	}
	

	/**
	 * Test, verify PetCat object is correctly created
	 */		
	@Test
	public void testPetCatWhenCreatePetBoltOwloo05() {
		PetCat animal = new PetCat("Princess", "meow", 1);		
		int result = animal.getCutenessLevel();		
		assertEquals(1, result);	
	}

}
