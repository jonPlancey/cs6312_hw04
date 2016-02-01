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
public class PetDogWhenCreatePetDogLevel {

	/**
	 * Test, verify PetDog object is correctly created
	 */		
	@Test
	public void testPetDogWhenCreatePetRalphWoofLevel0() {
		PetDog animal = new PetDog("Harris", "boo", 35);		
		int result = animal.getPetDogLevel();		
		assertEquals(35, result);	
	}
	

	/**
	 * Test, verify PetDog object is correctly created
	 */		
	@Test
	public void testPetDogWhenCreatePetNalaRoarLevel0() {
		PetDog animal = new PetDog("Nala", "roar", 77);		
		int result = animal.getPetDogLevel();		
		assertEquals(77, result);	
	}
	

	/**
	 * Test, verify PetDog object is correctly created
	 */		
	@Test
	public void testPetDogWhenCreatePetVioletArfLevel0() {
		PetDog animal = new PetDog("Violet", "arf", 10);		
		int result = animal.getPetDogLevel();		
		assertEquals(10, result);	
	}
	

	/**
	 * Test, verify PetDog object is correctly created
	 */		
	@Test
	public void testPetDogWhenCreatePetBoltOwlooLevel0() {
		PetDog animal = new PetDog("Bolt", "owloo", 5);		
		int result = animal.getPetDogLevel();		
		assertEquals(5, result);	
	}	
}