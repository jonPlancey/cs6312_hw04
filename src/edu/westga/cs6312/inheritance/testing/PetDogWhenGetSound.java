package edu.westga.cs6312.inheritance.testing;

import static org.junit.Assert.*;
import org.junit.Test;

import edu.westga.cs6312.inheritance.model.PetDog;




/**
 * Homework 04 Unit Tests
 * @author 	cs6312
 * @author 	jim perry, jr.
 * @version	01.30.2016
 */
public class PetDogWhenGetSound {

	/**
	 * Test, make sure getPetDogSound returns
	 * the correct sound of the created pet
	 */	
	@Test
	public void testPetDogWhenGetSoundBoo() {
		PetDog pet = new PetDog("Harris", "boo");		
		String result = pet.getPetDogSound();		
		assertEquals("boo", result);	
	}
	

	/**
	 * Test, make sure getPetDogSound returns
	 * the correct sound of the created pet
	 */		
	@Test
	public void testPetDogWhenGetSoundRoar() {
		PetDog pet = new PetDog("Nala", "roar");		
		String result = pet.getPetDogSound();		
		assertEquals("roar", result);		
	}
	

	
	
	
	/**
	 * Test, make sure getPetDogSound returns
	 * the correct sound of the created pet
	 */		
	@Test
	public void testPetDogWhenGetSoundArf() {
		PetDog pet = new PetDog("Violet", "arf", 77);		
		String result = pet.getPetDogSound();		
		assertEquals("arf", result);	
	}
	

	/**
	 * Test, make sure getPetDogSound returns
	 * the correct sound of the created pet
	 */		
	@Test
	public void testPetDogWhenGetSoundOwloo() {
		PetDog pet = new PetDog("Bolt", "owloo", 11);		
		String result = pet.getPetDogSound();		
		assertEquals("owloo", result);	
	}
	

	
	
	
	/**
	 * Test, make sure getPetDogSound returns
	 * the correct sound of the created pet
	 */		
	@Test
	public void testPetDogWhenGetLevel07() {
		PetDog pet = new PetDog("Violet", "arf", 7);		
		int result = pet.getPetDogLevel();		
		assertEquals(7, result);	
	}
	

	/**
	 * Test, make sure getPetDogSound returns
	 * the correct sound of the created pet
	 */		
	@Test
	public void testPetDogWhenGetLevel01() {
		PetDog pet = new PetDog("Bolt", "owloo", 1);		
		int result = pet.getPetDogLevel();		
		assertEquals(1, result);	
	}		

}
