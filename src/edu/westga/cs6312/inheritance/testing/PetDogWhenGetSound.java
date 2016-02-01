package edu.westga.cs6312.inheritance.testing;

import static org.junit.Assert.*;
import org.junit.Test;

import edu.westga.cs6312.inheritance.model.PetDog;

public class PetDogWhenGetSound {

	/**
	 * Test, make sure getPetDogSoun returns
	 * the correct sound of the created pet
	 */	
	@Test
	public void testPetDogWhenGetSoundBoo() {
		PetDog pet = new PetDog("Harris", "boo");		
		String expect = "boo";
		String result = pet.getPetDogSound();		
		assertEquals(expect, result);	
	}
	

	/**
	 * Test, make sure getPetDogSoun returns
	 * the correct sound of the created pet
	 */		
	@Test
	public void testPetDogWhenGetSoundRoar() {
		PetDog pet = new PetDog("Nala", "roar");		
		String expect = "roar";
		String result = pet.getPetDogSound();		
		assertEquals(expect, result);		
	}
	

	/**
	 * Test, make sure getPetDogSoun returns
	 * the correct sound of the created pet
	 */		
	@Test
	public void testPetDogWhenGetSoundArf() {
		PetDog pet = new PetDog("Violet", "arf");		
		String expect = "arf";
		String result = pet.getPetDogSound();		
		assertEquals(expect, result);	
	}
	

	/**
	 * Test, make sure getPetDogSoun returns
	 * the correct sound of the created pet
	 */		
	@Test
	public void testPetDogWhenGetSoundOwloo() {
		PetDog pet = new PetDog("Bolt", "owloo");		
		String expect = "owloo";
		String result = pet.getPetDogSound();		
		assertEquals(expect, result);	
	}	

}
