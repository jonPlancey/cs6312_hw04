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
public class PetWhenCreatePet {

	/**
	 * Test, verify PetDog object is correctly created
	 */		
	@Test
	public void testPetDogWhenCreatePetRalphWoof() {
		Pet dog = new Pet("Harris", "boo");		
		String expect = "A pet named Harris that makes the sound boo";
		String result = dog.toString();		
		assertEquals(expect, result);	
	}
	

	/**
	 * Test, verify PetDog object is correctly created
	 */		
	@Test
	public void testPetDogWhenCreatePetNalaRoar() {
		Pet dog = new Pet("Nala", "roar");		
		String expect = "A pet named Nala that makes the sound roar";
		String result = dog.toString();		
		assertEquals(expect, result);	
	}
	

	/**
	 * Test, verify PetDog object is correctly created
	 */		
	@Test
	public void testPetDogWhenCreatePetVioletArf() {
		Pet dog = new Pet("Violet", "arf");		
		String expect = "A pet named Violet that makes the sound arf";
		String result = dog.toString();		
		assertEquals(expect, result);	
	}
	

	/**
	 * Test, verify PetDog object is correctly created
	 */		
	@Test
	public void testPetDogWhenCreatePetBoltOwloo() {
		Pet dog = new Pet("Bolt", "owloo");		
		String expect = "A pet named Bolt that makes the sound owloo";
		String result = dog.toString();		
		assertEquals(expect, result);	
	}	

}
