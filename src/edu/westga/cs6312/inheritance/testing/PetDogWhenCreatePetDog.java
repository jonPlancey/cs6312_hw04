package edu.westga.cs6312.inheritance.testing;

import static org.junit.Assert.*;
import org.junit.Test;

import edu.westga.cs6312.inheritance.model.PetDog;

public class PetDogWhenCreatePetDog {

	/**
	 * Test, verify PetDog object is correctly created
	 */		
	@Test
	public void testPetDogWhenCreatePetRalphWoof() {
		PetDog animal = new PetDog("Harris", "boo");		
		String expect = "A pet named Harris that makes the sound boo";
		String result = animal.toString();		
		assertEquals(expect, result);	
	}
	

	/**
	 * Test, verify PetDog object is correctly created
	 */		
	@Test
	public void testPetDogWhenCreatePetNalaRoar() {
		PetDog animal = new PetDog("Nala", "roar");		
		String expect = "A pet named Nala that makes the sound roar";
		String result = animal.toString();		
		assertEquals(expect, result);	
	}
	

	/**
	 * Test, verify PetDog object is correctly created
	 */		
	@Test
	public void testPetDogWhenCreatePetVioletArf() {
		PetDog animal = new PetDog("Violet", "arf");		
		String expect = "A pet named Violet that makes the sound arf";
		String result = animal.toString();		
		assertEquals(expect, result);	
	}
	

	/**
	 * Test, verify PetDog object is correctly created
	 */		
	@Test
	public void testPetDogWhenCreatePetBoltOwloo() {
		PetDog animal = new PetDog("Bolt", "owloo");		
		String expect = "A pet named Bolt that makes the sound owloo";
		String result = animal.toString();		
		assertEquals(expect, result);	
	}	

}
