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
public class PetDogWhenCreatePetDog {

	/**
	 * Test, verify PetDog object is correctly created
	 */		
	@Test
	public void testPetDogWhenCreatePetRalphWoofLevel0() {
		PetDog animal = new PetDog("Harris", "boo");		
		String expect = "A pet named Harris that makes the sound boo at level 0";
		String result = animal.toString();		
		assertEquals(expect, result);	
	}


	/**
	 * Test, verify PetDog object is correctly created
	 */		
	@Test
	public void testPetDogWhenCreatePetNalaRoarLevel0() {
		PetDog animal = new PetDog("Nala", "roar");		
		String expect = "A pet named Nala that makes the sound roar at level 0";
		String result = animal.toString();		
		assertEquals(expect, result);	
	}
	

	/**
	 * Test, verify PetDog object is correctly create dwith sound level
	 */		
	@Test
	public void testPetDogWhenCreatePetVioletArfLeve05() {
		PetDog animal = new PetDog("Violet", "arf", 5);		
		int result = animal.getPetDogLevel();		
		assertEquals(5, result);
	}
	

	/**
	 * Test, verify PetDog object is correctly created with sound level
	 */		
	@Test
	public void testPetDogWhenCreatePetBoltOwlooLeve08() {
		PetDog animal = new PetDog("Bolt", "owloo", 8);		
		int result = animal.getPetDogLevel();		
		assertEquals(8, result);
	}	
	
	
	

	/**
	 * Test, verify PetDog object is correctly created
	 * and dog levels can be changed
	 */		
	@Test
	public void testPetDogWhenCreatePetRalphWoofLeve09() {
		PetDog animal = new PetDog("Harris", "boo", 2);		
		animal.setPetDogLevel(9);
		int result = animal.getPetDogLevel();		
		assertEquals(9, result);	
	}
	
	

	/**
	 * Test, verify PetDog object is correctly created
	 * and dog levels can be changed
	 */			
	@Test
	public void testPetDogWhenCreatePetRalphWoofLeve04() {
		PetDog animal = new PetDog("Harris", "boo", 11);		
		animal.setPetDogLevel(4);
		int result = animal.getPetDogLevel();	
		System.out.println(result);
		assertEquals(4, result);	
	}		
	
	
}
