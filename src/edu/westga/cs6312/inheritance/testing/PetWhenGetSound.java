package edu.westga.cs6312.inheritance.testing;

import static org.junit.Assert.*;
import org.junit.Test;

import edu.westga.cs6312.inheritance.model.Pet;


/**
 * Homework 04 Unit Tests
 * @author 	cs6312
 * @author 	jim perry, jr.
 * @version	01.30.2016
 */
public class PetWhenGetSound {


	/**
	 * Test, make sure getPetSoun returns
	 * the correct sound of the created pet
	 */	
	@Test
	public void testPetWhenGetSoundBoo() {
		Pet pet = new Pet("Harris", "boo");		
		String expect = "boo";
		String result = pet.getPetSound();		
		assertEquals(expect, result);	
	}
	

	/**
	 * Test, make sure getPetSoun returns
	 * the correct sound of the created pet
	 */		
	@Test
	public void testPetWhenGetSoundRoar() {
		Pet pet = new Pet("Nala", "roar");		
		String expect = "roar";
		String result = pet.getPetSound();		
		assertEquals(expect, result);		
	}
	

	/**
	 * Test, make sure getPetSoun returns
	 * the correct sound of the created pet
	 */		
	@Test
	public void testPetWhenGetSoundArf() {
		Pet pet = new Pet("Violet", "arf");		
		String expect = "arf";
		String result = pet.getPetSound();		
		assertEquals(expect, result);	
	}
	

	/**
	 * Test, make sure getPetSoun returns
	 * the correct sound of the created pet
	 */		
	@Test
	public void testPetWhenGetSoundOwloo() {
		Pet pet = new Pet("Bolt", "owloo");		
		String expect = "owloo";
		String result = pet.getPetSound();		
		assertEquals(expect, result);	
	}	
	


}
