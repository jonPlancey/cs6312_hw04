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
	 * Test, verify PetDog object is correctly created
	 */		
	@Test
	public void testPetDogWhenCreatePetVioletArfLevel0() {
		PetDog animal = new PetDog("Violet", "arf");		
		String expect = "A pet named Violet that makes the sound arf at level 0";
		String result = animal.toString();		
		assertEquals(expect, result);	
	}
	

	/**
	 * Test, verify PetDog object is correctly created
	 */		
	@Test
	public void testPetDogWhenCreatePetBoltOwlooLevel0() {
		PetDog animal = new PetDog("Bolt", "owloo");		
		String expect = "A pet named Bolt that makes the sound owloo at level 0";
		String result = animal.toString();		
		assertEquals(expect, result);	
	}	

}
