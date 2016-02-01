package edu.westga.cs6312.inheritance.testing;

import static org.junit.Assert.*;
import org.junit.Test;

import edu.westga.cs6312.inheritance.model.PetDog;

public class PetDogWhenGetSound {

	/**
	 * Test, make sure getPetDogSound returns
	 * the correct sound of the created pet
	 */	
	@Test
	public void testPetDogWhenGetSoundBoo() {
		PetDog pet = new PetDog("Harris", "boo");		
		int expect = 0;
		String result = pet.getPetDogSound();		
		assertEquals(expect, result);	
	}
	

	/**
	 * Test, make sure getPetDogSound returns
	 * the correct sound of the created pet
	 */		
	@Test
	public void testPetDogWhenGetSoundRoar() {
		PetDog pet = new PetDog("Nala", "roar");		
		int expect = 0;
		String result = pet.getPetDogSound();		
		assertEquals(expect, result);		
	}
	

	/**
	 * Test, make sure getPetDogSound returns
	 * the correct sound of the created pet
	 */		
	@Test
	public void testPetDogWhenGetSoundArf() {
		PetDog pet = new PetDog("Violet", "arf", 77);		
		int expect = 77;
		String result = pet.getPetDogSound();		
		assertEquals(expect, result);	
	}
	

	/**
	 * Test, make sure getPetDogSound returns
	 * the correct sound of the created pet
	 */		
	@Test
	public void testPetDogWhenGetSoundOwloo() {
		PetDog pet = new PetDog("Bolt", "owloo", 11);		
		int expect = 11;
		String result = pet.getPetDogSound();		
		assertEquals(expect, result);	
	}	

}
